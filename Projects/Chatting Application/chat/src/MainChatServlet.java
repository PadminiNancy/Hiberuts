package kogent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

public class MainChatServlet extends HttpServlet{
    String chRoomPath;
    String roomListPath;
    String adminChatPath;
		
    public void init(){
        ServletContext servletcontext = getServletContext();
		
		servletcontext.setAttribute("chRoomPath", servletcontext.getInitParameter("CHROOM_PATH"));
		servletcontext.setAttribute("roomListPath", servletcontext.getInitParameter("ROOMLIST_PATH"));
		servletcontext.setAttribute("adminChatPath", servletcontext.getInitParameter("ADMINCHAT_PATH"));      				
    }
	
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		doPost(request, response);		
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		HttpSession session=request.getSession();
		
		chRoomPath=(String)getServletContext().getAttribute("chRoomPath");
		roomListPath=(String)getServletContext().getAttribute("roomListPath");
		adminChatPath=(String)getServletContext().getAttribute("adminChatPath");
		session.setAttribute("chRoomPath",chRoomPath );
		session.setAttribute("roomListPath", roomListPath);
		session.setAttribute("adminChatPath", adminChatPath);
		HashMap hashmap = null;		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:San","scott","tiger");
			synchronized(getServletContext()){
		    hashmap = (HashMap)getServletContext().getAttribute("roomList");
				if(hashmap == null){
					hashmap = new HashMap();
					Statement stmt = con.createStatement();
					String query = "select * from chatrooms";
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()){
						hashmap.put(rs.getString(1), new ChatRooms (rs.getString(1), rs.getString(2), 4));
					}
					rs.close();
					getServletContext().setAttribute("roomList", hashmap);				
				}
        	}       
			con.close();
			
		}catch(SQLException e){}
		catch(ClassNotFoundException e){}
		RequestDispatcher view=request.getRequestDispatcher("chat.jsp");
		view.forward(request, response);
		
    }
}
