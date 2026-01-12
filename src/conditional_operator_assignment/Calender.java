package conditional_operator_assignment;

public class Calender {

	public static void main(String[] args) {
		int month_number=10;
		String res=((month_number>=1) && (month_number<=12))?"Valid Month":"Invalid Month";
		System.out.println(res);
	}

}
