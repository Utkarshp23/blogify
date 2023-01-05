package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Comment;


@WebServlet("/getComments")
public class GetComments extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		con=(Connection) config.getServletContext().getAttribute("dbcon");
	}

	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement stmt=null;
		ResultSet rs= null;
		int tpid=Integer.parseInt(request.getParameter("tpid"));
		List<Comment> commentList= new ArrayList<>();
		HttpSession session = request.getSession();
		
		try {
			stmt=con.prepareStatement("select c.cid,c.text,c.topicid, c.uid, u.fnanme,t.name from comments c,users u,topic t where c.topicid=? and t.topicid=c.topicid and c.uid=u.uid");
			stmt.setInt(1, tpid);
			
			rs=stmt.executeQuery();
			
			while(rs.next())
			{
				Comment c= new Comment(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
				commentList.add(c);
			}
			session.setAttribute("commentList", commentList);
			RequestDispatcher rd= request.getRequestDispatcher("ViewComments.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
