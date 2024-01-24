package Employee_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Employee_Model.Model;


@WebServlet("/store")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<table border='5'>");
		out.println("<tr>");
		out.println("<th>");
		out.println("Name");
		out.println("</th>");
		out.println("<th>");
		out.println("City");
		out.println("</th>");
		out.println("<th>");
		out.println("Email");
		out.println("</th>");
		out.println("<th>");
		out.println("Post");
		out.println("</th>");
		out.println("</tr>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arka","root","T#9758@qlph");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from company");
			
			while(result.next()) {
				out.println("<tr>");
				out.println("<td>");
				out.println(result.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(4));
				out.println("</td>");
				out.println("</tr>");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		out.println("</table>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String post = request.getParameter("post");
		
		Model m1 = new Model();
		m1.connectDb();
		m1.storedata(name, city, email, post);
		request.setAttribute("x", "Data saved!!");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/newEmployee.jsp");
		rd.forward(request, response);
	}

}
