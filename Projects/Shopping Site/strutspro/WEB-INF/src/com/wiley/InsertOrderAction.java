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
import com.wiley.*;

import java.sql.*;
import java.util.*;

public class InsertOrderAction extends Action{
	protected void insertOrder(ActionForm form, ArrayList inShoppingCartArr, HttpSession inSession)
		throws Exception {
		System.err.println("********** inside------AddOrderAction********** before connection");
		String user = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			OrderForm orderForm = (OrderForm)form;
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
			stmt = conn.createStatement();
			Long lOrderId =  new Long(0);
			String lContactName = "";
			String lDeliverAddress = "";
			String lCCName = "";
			String lCCNumber = "";
			String lCCExpriyDate = "";
			lOrderId        =  Long.parseLong(orderForm.getOrder_id());
			lContactName    =  orderForm.getContact_name();
			lDeliverAddress =  orderForm.getDelivery_address();
			lCCName         =  orderForm.getCc_name();
			lCCNumber       =  orderForm.getCc_number();
			lCCExpriyDate   =  orderForm.getCc_expiry_date();
			StringBuffer lQueryString =new StringBuffer("insert into OLNS_PROD_ORDER ");
			lQueryString.append("values ("+ lOrderId + ", ");
			lQueryString.append("'"+ lContactName + "' , ");
			lQueryString.append("'"+ lDeliverAddress + "' , ");
			lQueryString.append("'" + lCCName + "' , ");
			lQueryString.append("'" + lCCNumber + "' , ");
			lQueryString.append("to_date('"+ lCCExpriyDate + "','yyyy-mm-dd') )");
			System.out.println(" Inside the OrderActionlQueryString================"+lQueryString);
			stmt.execute(lQueryString.toString());
			//preparing the Order bean
			Order lOrder = new Order();
			lOrder.order_id      = lOrderId;
			lOrder.contact_name  = lContactName;
			lOrder.delivery_address = lDeliverAddress;
			lOrder.cc_name          = lCCName;
			lOrder.cc_number        = lCCNumber; 
			lOrder.cc_expiry_date    = lCCExpriyDate ;

			ArrayList lOrderDtlArr = new ArrayList();
			Long num=new Long(101);
			for( int lArrSize = 1; lArrSize <= inShoppingCartArr.size() ; lArrSize++ ){
			 	OrderDetail lOrderDtl = new OrderDetail();
				ShoppingItem lShoppingItem = new ShoppingItem();
				lShoppingItem = (ShoppingItem)inShoppingCartArr.get(lArrSize-1);
			 	lOrderDtl.order_dtl_id = num++;
			 	lOrderDtl.order_id = lOrderId;
				lOrderDtl.product_id = lShoppingItem.product_id;
				lOrderDtl.order_qty = lShoppingItem.quantity;
				lOrderDtl.order_price = lShoppingItem.subtotal;
				Statement stmtOrderDtl = conn.createStatement();
				StringBuffer lOrderDtlQueryString =new StringBuffer("insert into OLNS_PROD_ORDER_DETAILS ");
				
				lOrderDtlQueryString.append("values ("+ lOrderDtl.order_dtl_id + ", ");
				lOrderDtlQueryString.append(""+ lOrderDtl.order_id + " , ");
				lOrderDtlQueryString.append(""+ lOrderDtl.product_id + " , ");
				lOrderDtlQueryString.append("" + lOrderDtl.order_qty + " , ");
				lOrderDtlQueryString.append(""+  lOrderDtl.order_price + " )");
				System.out.println(" Inside the OrderActionlQueryString======lOrderDtlQueryString=="+lOrderDtlQueryString);
				stmtOrderDtl.execute(lOrderDtlQueryString.toString());
				lOrderDtlArr.add(lOrderDtl);
			}
			inSession.setAttribute("lOrderDtlArr", lOrderDtlArr);
			inSession.setAttribute("order", lOrder);
		}
		finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	public ActionForward execute(ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws IOException, ServletException {
		
		System.err.println("********** inside------InsideInsertOrderAction**********");
		// Default target to success
		String target = "success";
		HttpSession session = request.getSession();
		ArrayList lShoppingCartArr = (ArrayList)session.getAttribute("lShoppingCartArr");
		try {
			if( lShoppingCartArr != null && lShoppingCartArr.size() > 0 ){
				insertOrder(form,lShoppingCartArr,session);
			}
		}
		catch (Exception e) {
			System.err.println("Setting target to error");
			target = "error";
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("errors.database.error", e.getMessage()));
			// Report any errors
			if (!errors.empty()){
				saveErrors(request, errors);
			}
		}
		// Forward to the appropriate View
		return (mapping.findForward(target));
	}
}