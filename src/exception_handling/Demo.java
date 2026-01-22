package exception_handling;
//Object->Throwable->Exception->RunTimeException
public class Demo {
	public static void main(String[] args) {
		//RuntimeException ->Unchecked Exception
		checkArithmaticException();
		checkNullPointerException();
		checkArrayIndexOutOfBoundsException();
		checkStringIndexOutOfBoundsException();
		checkClassCastException();
		checkUsingParentExceptionClass();
	}

	private static void checkArithmaticException() {
		try {
			System.out.println(7/0);
		} catch(ArithmeticException e) {
			System.out.println("Divide number by zero is not possible. ");
		}
		
	}
	private static void checkNullPointerException() {
		String s=null;
		try {
			System.out.println(s.charAt(0));
		} catch(NullPointerException e) {
			System.out.println("Operations on null is not possible. ");
		}
		
	}
	private static void checkArrayIndexOutOfBoundsException() {
		int [] arr=new int[2];
		try {
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound happens. ");
		}
		
	}
	private static void checkStringIndexOutOfBoundsException() {
		String s="abc";
		try {
			System.out.println(s.charAt(4));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index out of bound happens. ");
		}
		
	}
	private static void checkClassCastException() {
		try {
			Object o=new Demo();
			Example ex=(Example)o;
			
		} catch(ClassCastException e) {
			System.out.println("Class Cast Exception happens. ");
		}
		
	}
	private static void checkUsingParentExceptionClass() {
		try {
			Object o=new Demo();
			Example ex=(Example)o;
			
		} catch(Exception e) {
			System.out.println("Exception class call happens. ");
		}
		
	}
}
