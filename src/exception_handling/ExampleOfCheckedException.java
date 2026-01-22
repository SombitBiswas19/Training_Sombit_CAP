package exception_handling;

public class ExampleOfCheckedException {

	public static void main(String[] args) {

		InterruptedException_CheckedException();
		ClassNotFoundException_CheckedException();
		Multiple_Catch_Block();
	}

	private static void InterruptedException_CheckedException() {
		System.out.println("Checking InterruptedException:");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("checked exception caused");
		}

		System.out.println("InterruptedException Ends");

	}
	private static void ClassNotFoundException_CheckedException() {
		System.out.println("Checking ClassNotFoundException:");
		try {
			Class.forName("exception_handling.Demoo");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Info is wrong");
		}
		System.out.println("ClassNotFoundException Ends");
		
	}
	private static void Multiple_Catch_Block() {
		System.out.println("Checking Multiple_Catch_Block:");
		try {
			Class.forName("exception_handling.Demoo");
		} catch (ArithmeticException e) {
			System.out.println("Arith");
		} catch(ClassNotFoundException e) {
			System.out.println("Class Info is wrong");
		} catch(Exception e)
		{
			System.out.println("Parent Class");
		}
		System.out.println("Multiple_Catch_Block Ends");
		
	}

}
