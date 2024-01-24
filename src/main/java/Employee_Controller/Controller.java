package Employee_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Employee_Model.Model;


@WebServlet("/save")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String password = request.getParameter("password");
	
		Model m1 = new Model();
		m1.connectDb();
		boolean status = m1.verify(name, password);
		
		if(status) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/newEmployee.jsp");
			rd.forward(request, response);
		
		}
		
		else {
			request.setAttribute("x", "invalid name/ password");
			RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
			rd.forward(request, response);
		}
	}

}
