package Employee_Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Employee_Model.Model;


@WebServlet("/delete")
public class DeleteControlleer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteControlleer() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		Model m1 = new Model();
		m1.connectDb();
		m1.deleteData(name);
		
		ResultSet res = m1.displayEmployee();
		request.setAttribute("res", res);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/display.jsp");
		rd.forward(request, response);
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
