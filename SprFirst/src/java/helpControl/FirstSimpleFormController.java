/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helpControl;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.SimpleFormController;

/** 
 *
 * @author Nancy
 */
@Controller
public class FirstSimpleFormController {

    @RequestMapping("/index")
    protected ModelAndView helloWorld()
             {
        ModelAndView mv = new ModelAndView("myNext");
        mv.addObject("message", "Whats going on?");
        //Do something...
        return mv;
    }
    

}