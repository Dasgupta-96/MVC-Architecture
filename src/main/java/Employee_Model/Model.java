package Employee_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model implements Model_Employee {

	private Connection con ;
	private  Statement stmnt;
	public void connectDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arka","root","T#9758@qlph");
			 stmnt = con.createStatement();
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verify(String name, String password) {
		
		try {
			ResultSet result= stmnt.executeQuery("select * from employee where name='"+name+"' and password = '"+password+"'");
			return result.next();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void storedata(String name, String city, String email, String post) {
	
		try {
			stmnt.execute("insert into company values('"+name+"', '"+city+"','"+email+"','"+post+"')");
			
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public ResultSet displayEmployee() {
		
		try {
			ResultSet result = stmnt.executeQuery("select * from company");
			
			return result;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	public void deleteData(String name) {
	
		try {
			stmnt.execute("delete from company where name='"+name+"'");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void updateEmployee(String name, String email) {
		
		try {
			stmnt.execute("update company set name='"+name+"' where email = '"+email+"'");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
