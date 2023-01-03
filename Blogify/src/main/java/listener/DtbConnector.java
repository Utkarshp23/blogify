package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class DtbConnector implements ServletContextListener {

	Connection con;
   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
//    	System.out.println("Inside....");
    	ServletContext ctx=sce.getServletContext();
    	String driver=ctx.getInitParameter("driver");
		String jdbcUrl=ctx.getInitParameter("jdbcurl");
		String username=ctx.getInitParameter("username");
		String password=ctx.getInitParameter("password");
//		System.out.println("Inside-1...");
		try {
			Class.forName(driver);
//			System.out.println("Inside-2...");
			con=DriverManager.getConnection(jdbcUrl,username,password);
//			System.out.println("Inside-3...");
			sce.getServletContext().setAttribute("dbcon", con);
			System.out.println("Connected successfully...");                                                                                        
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
    }
	
}
