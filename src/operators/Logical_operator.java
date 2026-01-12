package operators;

public class Logical_operator {

	public static void main(String[] args) {
		int a=3,b=4;
		//Always input and output should be boolean of this type of the operator
		System.out.println((a<b)&&(b>a)); //AND operator -->both side should be true
		System.out.println((a<b)||(b==a)); //OR Operator --> Any of the side should be true
		System.out.println(!true); //NOT Operator ->Unary
	}

}
