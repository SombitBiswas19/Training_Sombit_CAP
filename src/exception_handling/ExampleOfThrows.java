package exception_handling;

public class ExampleOfThrows {

	public static void main(String[] args) throws ClassNotFoundException, ArithmeticException {

		try {
			m1();
		} catch (Exception e) {
			System.out.println("Handled");
		}

	}

	public static void m1() throws Exception {
		System.out.println("hi");
		Class.forName("exception_handling.Demoo");
		Thread.sleep(3);
		System.out.println("bye");
	}

}
