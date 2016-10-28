package como.yacarreon.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set up connection variables 
		String user="projects";
		String pass="projects";		
		String jdbcUrl = "jdbc:mysql://localhost:3306/spring_demo?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// get the connection to database
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + jdbcUrl);
			Class.forName(driver);			
			Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Success!");			
			connection.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}

}
