package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

import entities.Topic;


@WebServlet("/getTopics")
public class GetTopics extends HttpServlet {
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
//		System.out.println("Inside...");
		Statement stmt=null;
		ResultSet rs= null;
		List<Topic> topicList=new ArrayList<>();
		HttpSession session= request.getSession();
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from topic");
			while(rs.next())
			{
				Topic t= new Topic(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				topicList.add(t);
			}
			
			session.setAttribute("topicList", topicList);
//			System.out.println("Inside...");
			RequestDispatcher rd=request.getRequestDispatcher("/ViewTopics.jsp");
//			System.out.println("Inside...");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
