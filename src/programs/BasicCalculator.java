package programs;

public class BasicCalculator {
	public static void main(String[] args) {
		int a=5,b=6;
		switch ('+') {
		case '+': {
			System.out.println(a+b);
		}
		break;
		case '-': {
			System.out.println(a-b);
		}
		break;
		case '*': {
			System.out.println(a*b);
		}
		break;
		case '/': {
			System.out.println(a/b);
		}
		break;
		case '%': {
			System.out.println(a%b);
		}
		break;
		default:
			System.out.println("No Match");
		}
	} 
	
}
