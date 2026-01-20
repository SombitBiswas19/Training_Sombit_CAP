package singleton_class_creation;

public class DBConnection {
	private static DBConnection con; //con used to store the singleton object
	public static DBConnection getDbConnection()  //Factory Method
	{
		if(con==null)
		{
			con=new DBConnection();
		}
		return con;
	}
	
	private DBConnection(){  //Restricting object creation in other class
		
	}
}
