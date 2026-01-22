package exception_handling;

public class FinallyBlockExecution {

	public static void main(String[] args) {
		finally_without_exception();
		System.out.println("+++++++++++++++++++++");
		finally_with_exception();
		System.out.println("+++++++++++++++++++++");
		System.out.println(finally_without_exception_with_return());  
		System.out.println("+++++++++++++++++++++");
		System.out.println(finally_without_exception_with_return1());  
		System.out.println("+++++++++++++++++++++");
		finally_with_Wrong_exception();
		System.out.println("+++++++++++++++++++++");
	}

	private static void finally_with_Wrong_exception() {
		try {
			System.out.println(7/0);
		} catch(NullPointerException e) {
			System.out.println("Divide number by zero is not possible. ");
		} finally {
			System.out.println("Finally of finally_with_Wrong_exception runs");
		}
		
	}

	private static void finally_with_exception() {
		try {
			System.out.println(7/0);
		} catch(ArithmeticException e) {
			System.out.println("Divide number by zero is not possible. ");
		} finally {
			System.out.println("Finally of finally_with_exception runs");
		}
		
	}

	private static void finally_without_exception() {
		try {
			System.out.println(7/1);
		} catch(ArithmeticException e) {
			System.out.println("Divide number by zero is not possible. ");
		} finally {
			System.out.println("Finally of finally_without_exception runs");
		}
		
	}
	private static int finally_without_exception_with_return() {
		try {
			return 1;
		} catch(ArithmeticException e) {
			System.out.println("Divide number by zero is not possible. ");
		} finally {
			System.out.println("Finally of finally_without_exception_with_return runs");
		}
		return 9;
	}
	private static int finally_without_exception_with_return1() {
		try {
			System.out.println(7/0);
			return 1;
		} catch(ArithmeticException e) {
			System.out.println("Divide number by zero is not possible. ");
		} finally {
			System.out.println("Finally of finally_without_exception_with_return runs");
		}
		return 9;
	}

}
