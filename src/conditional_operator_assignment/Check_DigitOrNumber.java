package conditional_operator_assignment;

public class Check_DigitOrNumber {

	public static void main(String[] args) {
		int num=-9;
		String second_option=((num>=10 && num<=99)||(num<=-10 && num>=-99))?"It is a Number":"Other";
		String res=((num>=0 && num<=9)||(num<=-1 && num>=-9))?"It is a digit":second_option;
		System.out.println(res);
	}

}
