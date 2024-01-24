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


@WebServlet("/display")
public class Display_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Display_Controller() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Model m1 = new Model();
		m1.connectDb();
		ResultSet res = m1.displayEmployee();
		request.setAttribute("res", res);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/display.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

}
}