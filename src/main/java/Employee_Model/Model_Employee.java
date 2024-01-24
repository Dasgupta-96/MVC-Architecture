package Employee_Model;

public interface Model_Employee {

	public void connectDb();
	public boolean verify(String name, String password);
	public void storedata(String name, String city, String email, String post);
	
}
