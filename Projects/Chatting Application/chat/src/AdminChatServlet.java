package kogent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

public class AdminChatServlet extends HttpServlet{
    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		doPost(request, response);		
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
		HashMap hashmap = null;		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:San","scott","tiger");
		synchronized(getServletContext()){
		    hashmap = (HashMap)getServletContext().getAttribute("roomList");
            if(hashmap == null)
            {
                
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
        //Removing Rooms
		String rooms[] = request.getParameterValues("remove");
        synchronized(hashmap){
            if(rooms != null){
				String deletequery = "delete from chatrooms where roomname=?" ;
				PreparedStatement pstate = con.prepareStatement(deletequery);
                for(int i = 0; i < rooms.length; i++){				 	
					pstate.setString(1,rooms[i]);
					pstate.executeUpdate();
					hashmap.remove(rooms[i]);				
                }
				pstate.close();	
            }
        }
        //adding room.
		String roomname = request.getParameter("roomname");
        String roomdesc = request.getParameter("roomdescr");
		
        if(roomname != null && roomname.length() > 0){
            synchronized(hashmap){
					String deletequery = "insert into chatrooms values(?, ?)" ;
					PreparedStatement pstate = con.prepareStatement(deletequery);
					pstate.setString(1,roomname);
					pstate.setString(2,roomdesc);
					pstate.executeUpdate();
					pstate.close();
					hashmap.put(roomname, new ChatRooms (roomname, roomdesc, 4));
            }
        }
		con.close();
		
		}catch(SQLException e){}
		catch(ClassNotFoundException e){}
        RequestDispatcher view=request.getRequestDispatcher("AdminChatServlet.jsp");
		view.forward(request, response);
		
    }
}
