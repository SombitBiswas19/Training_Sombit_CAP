package methods;

public class Calculator2 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		char ch = '+';
		switch (ch) {
		case '+':
			System.out.println(add(2147483647, 2147483647));
			break;
		case '-':
			System.out.println(sub(15, 60));
			break;
		case '*':
			System.out.println(mul(123, 999));
			break;
		case '/':
			System.out.println(div(20, 3));
			break;
		case '%':
			System.out.println(modu(20, 3));
			break;
		default:
			System.out.println("No Match");
		}

	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

	public static int modu(int a, int b) {
		return a % b;
	}
}
