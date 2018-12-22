package com.wiley;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import java.util.*;

public class AddItem2CartAction extends Action {
	protected ArrayList addItem( ActionForm form, ArrayList inShoppingCartArr ) {
		System.out.println("**********i m in add item********Arrsize===="+inShoppingCartArr.size());
		ProductForm productForm = (ProductForm)form;
		ShoppingItem lShoppingItem = new ShoppingItem();
		lShoppingItem.product_id  = new Long(productForm.product_id);
		lShoppingItem.name        = productForm.getName();
		lShoppingItem.description = productForm.getDescription(); 
		lShoppingItem.price       = new Double(productForm.getPrice()) ;         
		lShoppingItem.quantity    = new Long(1);
		lShoppingItem.subtotal    = lShoppingItem.quantity * lShoppingItem.price;
		int lAddedFlag = 0;
		int lNotAddedFlag = 0;
		System.out.println("*****+ lShoppingItem.product_id==="+ lShoppingItem.product_id+"=lShoppingItem.name==="+lShoppingItem.name);
		if(inShoppingCartArr != null && inShoppingCartArr.size() > 0 ){
			for( int lArrSize = 1; lArrSize <= inShoppingCartArr.size(); lArrSize++ ){
				System.out.println("**********i m in for loop");
				ShoppingItem inShoppingItem = new ShoppingItem();
				inShoppingItem = (ShoppingItem)inShoppingCartArr.get(lArrSize-1);
				if( !((Long.toString(inShoppingItem.product_id).equals(Long.toString(lShoppingItem.product_id))) 
					&& (((inShoppingItem.name).trim()).equals((lShoppingItem.name).trim())))){
					lNotAddedFlag = 1;
				}
				else{
					lAddedFlag = 1;
				}
			}	
			if ( lAddedFlag == 0){
				System.out.println("**********i m in add   lAddedFlag=="+lAddedFlag); 
				inShoppingCartArr.add(lShoppingItem);
			}
			System.out.println("**********i m out of for inShoppingCartArr.size()"+inShoppingCartArr.size());
		}
		else{
			inShoppingCartArr.add(lShoppingItem);
		}
		return inShoppingCartArr;
	}
	protected ArrayList removeItem( ActionForm form, ArrayList inShoppingCartArr ) {
		System.out.println("**********i m in remove item********Arrsize===="+inShoppingCartArr.size());
		ShoppingItemForm shoppingItemForm = (ShoppingItemForm)form;
		ShoppingItem lShoppingItem = new ShoppingItem();
		lShoppingItem.product_id  = new Long(shoppingItemForm.product_id);
		lShoppingItem.name        = shoppingItemForm.getName();
		lShoppingItem.description = shoppingItemForm.getDescription(); 
		lShoppingItem.price       = new Double(shoppingItemForm.getPrice()) ;         
		lShoppingItem.quantity    = new Long(shoppingItemForm.getQuantity());
		for( int lArrSize = 1; lArrSize <= inShoppingCartArr.size(); lArrSize++ ){
			ShoppingItem inShoppingItem = new ShoppingItem();
			inShoppingItem = (ShoppingItem)inShoppingCartArr.get(lArrSize-1);
			if((inShoppingItem.product_id).equals(lShoppingItem.product_id) 
				&& (inShoppingItem.name).equals(lShoppingItem.name)){
				int lItemIndex = inShoppingCartArr.indexOf(inShoppingItem);
				inShoppingCartArr.remove(lItemIndex);
			}
		}	
		return inShoppingCartArr;
	}
protected ArrayList updateItem( ActionForm form, ArrayList inShoppingCartArr ) {
	System.out.println("**********i m in update item********Arrsize===="+inShoppingCartArr.size());
	ShoppingItemForm shoppingItemForm = (ShoppingItemForm)form;
	ShoppingItem lShoppingItem = new ShoppingItem();
	lShoppingItem.product_id  = new Long(shoppingItemForm.product_id);
	lShoppingItem.name        = shoppingItemForm.getName();
	lShoppingItem.description = shoppingItemForm.getDescription(); 
	lShoppingItem.price       = new Double(shoppingItemForm.getPrice()) ;         
	lShoppingItem.quantity    = new Long(shoppingItemForm.getQuantity());
	lShoppingItem.subtotal    = lShoppingItem.quantity * lShoppingItem.price;
	System.out.println("**********lShoppingItem.subtotal ====="+lShoppingItem.subtotal);
	for( int lArrSize = 1; lArrSize <= inShoppingCartArr.size(); lArrSize++ ){
		ShoppingItem inShoppingItem = new ShoppingItem();
		inShoppingItem = (ShoppingItem)inShoppingCartArr.get(lArrSize-1);
		if((inShoppingItem.product_id).equals(lShoppingItem.product_id) && (inShoppingItem.name).equals(lShoppingItem.name)){
			int lItemIndex = inShoppingCartArr.indexOf(inShoppingItem);
			inShoppingCartArr.set(lItemIndex,lShoppingItem);
		}
	}	
	return inShoppingCartArr;
}
public ActionForward execute( ActionMapping mapping, ActionForm form,
	HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	// Default target to success
	String target = "success";
	HttpSession session = request.getSession();   
	if ( isCancelled(request) ){
		// Cancel pressed back to Category list
		return (mapping.findForward("success"));
	}
	try {
		ArrayList lShoppingCartFromSession = (ArrayList)session.getAttribute("lShoppingCartArr");
		if( lShoppingCartFromSession == null )
			lShoppingCartFromSession = new ArrayList();
		ArrayList lShoppingCart = new ArrayList();
		String lOpr = "";
		lOpr = (String)request.getParameter("opr");
		System.out.println("lOpr**********"+lOpr);
		String submit = "";
		submit = request.getParameter("submit");
		
		if(submit != null && submit.equals("Update") )
			lShoppingCart = (ArrayList)updateItem(form,lShoppingCartFromSession);
		else 
			if(submit != null && submit.equals("Remove") )
				lShoppingCart = (ArrayList)removeItem(form,lShoppingCartFromSession);
			else
				lShoppingCart = (ArrayList)addItem(form,lShoppingCartFromSession);
		session.setAttribute("lShoppingCartArr",lShoppingCart);
		}
		catch (Exception e) {
			System.err.println("Setting target to error");
			target = "error";
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("errors.database.error",e.getMessage()));
			// Report any errors
			if (!errors.empty()) {
				saveErrors(request, errors);
			}
		}
		// Forward to the appropriate View
		return (mapping.findForward(target));
	}
}