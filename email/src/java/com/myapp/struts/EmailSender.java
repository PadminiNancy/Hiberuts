/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.Properties;
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BIKI
 */
public class EmailSender {
    public  String sendMail(String login, String password,String from, String to, String sub, String message)throws Exception
    {

        // from = "vivekbhardwajmca@gmail.com";
       //  to = request.getParameter("to");
      //  String subject = request.getParameter("subject");
     //   String message = request.getParameter("message");
      //  String login = "vivekbhardwajmca@gmail.com";
     //   String password = "mypassword";


            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");

            Authenticator auth = new SMTPAuthenticator(login, password);

            Session session = Session.getInstance(props, auth);

            MimeMessage msg = new MimeMessage(session);
            msg.setText(message);
            msg.setSubject(sub);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            Transport.send(msg);
return "success";

        }




        private class SMTPAuthenticator extends Authenticator {

        private PasswordAuthentication authentication;

        public SMTPAuthenticator(String login, String password) {
            authentication = new PasswordAuthentication(login, password);
        }

        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }

}

}