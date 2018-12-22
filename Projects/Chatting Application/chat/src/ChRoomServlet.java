package kogent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;
import java.text.*;

public class ChRoomServlet extends HttpServlet{
    String chRoomPath;
    String roomListPath;

    public ChRoomServlet(){
    }
    public void init(){
	    ServletContext servletcontext = getServletContext();
        chRoomPath = servletcontext.getInitParameter("CHROOM_PATH");
        roomListPath = servletcontext.getInitParameter("ROOMLIST_PATH");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
        PrintWriter printwriter = response.getWriter();
        ChatRooms  chatroom = getRoom(request, response);
        if(chatroom == null){
            return;
        }
		String s = request.getParameter("list");
        
		if(s != null && s.equals("true")){
            writeMessage(printwriter, chatroom, getProfileName(request));
        } 
		else{
            printwriter.println("<html>");
			printwriter.println("<link href='mystyle.css' rel='stylesheet' type='text/css'>");
            printwriter.println("<body marginheight=0 marginwidth=0>");
            printwriter.println("<form method=\"post\" action=\"" + response.encodeURL(chRoomPath) + "\" target=\"_top\">");
			printwriter.println("<table align=center width=100%>");
			printwriter.println("<tr><td><font color='#476BC0'>Your message</font></td></tr>");
            printwriter.println("<tr><td><textarea name=msg cols=50 rows=3 class=smalltext></textarea></td></tr>");
            printwriter.println("<tr><td><input type=submit value='Send' class=smalltext></td></tr>");
            printwriter.println("</table></form>");
			printwriter.println("<form action=\"" + response.encodeURL(roomListPath) + "\" method=\"get\" target=\"_top\">");
            printwriter.println("<center><input type=submit value='Exit from Chat Room' class=smalltext>");
            printwriter.println("</center></form>");
			printwriter.println("<form action=logout.jsp method=get target='_top'>");
            printwriter.println("<center><input type=submit value='Logout' class=smalltext>");
            printwriter.println("</center></form>");
            printwriter.println("</body></html>");
        }
        printwriter.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		response.setContentType("text/html");
        ChatRooms  chatroom = getRoom(request, response);
        if(chatroom == null){
        	return;
        }
		String s = getProfileName(request);
        String s1 = request.getParameter("msg");
        if(s1 != null && s1.length() != 0){
			DateFormat d=new SimpleDateFormat("hh:mm");
			String time=d.format(new Date());
			s1="[ "+time+" ] " +s1;
            chatroom.joinChatEntry(new ChatRoomEntry (s, s1));
        }
        messageFrame(response, chatroom);
    }
    private String getProfileName(HttpServletRequest request){
	    HttpSession httpsession = request.getSession(true);
        String s = (String)httpsession.getAttribute("profileName");
        if(s == null){
            s = request.getParameter("profileName");
            if(s == null || s.length() == 0){
                s = "Anonymous";
            }
            httpsession.setAttribute("profileName", s);
        } 
		else{
		    String s1 = request.getParameter("profileName");
            if(s1 != null && s1.length() > 0 && !s1.equals(s)){
                s = s1;
                httpsession.setAttribute("profileName", s);
            }
        }
        return s;
    }

    private ChatRooms  getRoom(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		HttpSession httpsession = request.getSession(true);
        PrintWriter printwriter = response.getWriter();
    	String s = (String)httpsession.getAttribute("roomName");
        if(s == null){
            s = request.getParameter("roomName");
            if(s == null || s.length() == 0){
                error(request, response);
                return null;
            }
            httpsession.setAttribute("roomName", s);
        }
		else{
		    String s1 = request.getParameter("roomName");
            if(s1 != null && s1.length() > 0 && !s1.equals(s)){
                s = s1;
                httpsession.setAttribute("roomName", s);
            }
        }
	    HashMap hashmap = (HashMap)getServletContext().getAttribute("roomList");
        ChatRooms  chatroom = (ChatRooms )hashmap.get(s);
    	if(chatroom == null){
            error(request, response);
            return null;
        }
		else{
            return chatroom;
        }
    }
    private void error(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	    RequestDispatcher view=request.getRequestDispatcher("error.jsp");
		view.forward(request, response);
    }

    private void messageFrame(HttpServletResponse response, ChatRooms  chatroom)
        throws IOException{
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html>");
        printwriter.println("<head><title>" + chatroom.getName() + "</title></head>");
        printwriter.println("<frameset cols='*,700,*' frameborder='no' framespacing='0'>");
		printwriter.println("<frame src=filler.html name=frame1>");
		printwriter.println("<frameset rows='320,180'>");
        printwriter.println("<frame src=\"" + response.encodeURL(chRoomPath) + "?list=true\" name=\"list\" SCROLLING=\"AUTO\">");
		printwriter.println("<frame src=\"" + response.encodeURL(chRoomPath) + "?list=false\" name=\"form\" SCROLLING=\"no\">");
        printwriter.println("</frameset>");
		printwriter.println("<frame src=filler.html name=frame3>");
		printwriter.println("</frameset>");
        printwriter.println("</html>");
        printwriter.close();
    }
    private void writeMessage(PrintWriter printwriter, ChatRooms  chatroom, String s){
        StringBuffer stringbuffer = new StringBuffer();
        printwriter.println("<html>");
        printwriter.println("<head><META http-equiv=\"refresh\" content=\"5\"></head>");
	printwriter.println("<link href='mystyle.css' rel='stylesheet' type='text/css'>");
        printwriter.println("<body marginheight=0 marginwidth=0>");
	printwriter.println("<table align=center bgcolor='#476BC0' width=100% height=100%>");
	printwriter.println("<tr><td valign=top>");
        printwriter.println("Chat-Room Name: " + chatroom.getName() + "<br>You are: " + s + "<br><br><br>");
        if(chatroom.size() == 0){
            printwriter.println("<font color=red>No messages available in this room</font>");
        }
		else{
		    for(Iterator iterator = chatroom.iterator(); iterator.hasNext();){
			    ChatRoomEntry  chatentry = (ChatRoomEntry )iterator.next();
                if(chatentry != null){
                    String s1 = chatentry.getProfileName();
                    if(s1.equals(s)){
                        printwriter.print("<font color=yellow>");
                    }
                    printwriter.println(s1 + " : " + chatentry.getMessage() + "<BR>");
                    if(s1.equals(s)){
                        printwriter.print("</font>");
                    }
                }
            }
        }
		printwriter.println("</td></tr></table>");
        printwriter.println("</body></html>");
    }
}