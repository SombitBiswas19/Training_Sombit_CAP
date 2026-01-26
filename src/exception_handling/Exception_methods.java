package exception_handling;

public class Exception_methods {
	
	public static void main(String[] args) {
		try {
			System.out.println(7/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}
