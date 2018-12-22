/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

//import java.util.jar.Attributes.Name;
import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.validation.BindException.*;
import service.HelloService;

/** 
 *
 * @author Nancy
 */
public class HelloController extends SimpleFormController {

     private  HelloService helloService;

    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

      
        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
    
   /* @Override
     void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
  //  @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
       // ModelAndView mv = new ModelAndView(getSuccessView());
        Name name = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", getHelloService().sayHello(name.getValue()));
        return mv;
       
        
    }

    /**
     * @return the helloService
     */
    public HelloService getHelloService() {
        return helloService;
    }

    /**
     * @param helloService the helloService to set
     */
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    

}