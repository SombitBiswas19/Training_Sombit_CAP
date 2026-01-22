package error_implementation;

public class Driver {
	public static void m1() {
		System.out.println("Run");
		// Exception in thread "main" java.lang.StackOverflowError
		// m1();
	}

	public static void m2() {
		// Exception in thread "main" java.lang.OutOfMemoryError:
		String s = "xyz";
		while (true) {
			s = s + s;
		}
	}

	public static void main(String[] args) {
		m1();
		//m2();
	}
}
