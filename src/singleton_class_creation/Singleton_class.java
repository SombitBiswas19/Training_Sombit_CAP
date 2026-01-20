package singleton_class_creation;

public class Singleton_class {
	
	public static void main(String[] args) {
		 Example i1 = Example.getInstance();
		 System.out.println(i1);
		 Example i2 = Example.getInstance();
		 System.out.println(i2);
		 
		 System.out.println(i1==i2);
		 
		 System.out.println("==================");
		 //Singleton object creation design pattern
		 DBConnection con1=DBConnection.getDbConnection();
		 DBConnection con2=DBConnection.getDbConnection();
		 DBConnection con3=DBConnection.getDbConnection();
		 
		 System.out.println(con1);
		 System.out.println(con2);
		 System.out.println(con3);
		 System.out.println("==================");
		 
		 FiveDBObjectCreation dbcon1=FiveDBObjectCreation.getConnection();
		 FiveDBObjectCreation dbcon2=FiveDBObjectCreation.getConnection();
		 FiveDBObjectCreation dbcon3=FiveDBObjectCreation.getConnection();
		 FiveDBObjectCreation dbcon4=FiveDBObjectCreation.getConnection();
		 FiveDBObjectCreation dbcon5=FiveDBObjectCreation.getConnection();
		 FiveDBObjectCreation dbcon6=FiveDBObjectCreation.getConnection();
		 System.out.println("==================");
		
	}
}
