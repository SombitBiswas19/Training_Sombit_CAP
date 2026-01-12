package programs;

public class Greatest_between_three {

	public static void main(String[] args) {
		int a=16,b=9,c=10;
		//nested conditional statement
		String res2=((c>a)&&(c>b))?"c is the greatest":(((b>a)&&(b>c))?"b is the greatest":"a is the greatest");
		System.out.println(res2);

	}

}
