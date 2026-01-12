package conditional_operator_assignment;

public class DivisibleByThreeAndFive {

	public static void main(String[] args) {
		int n=25;
		String res=(n%3==0 && n%5==0)?"Divisible by Three and Five":"Not divisible by Three and Five";
		System.out.println(res);
	}

}
