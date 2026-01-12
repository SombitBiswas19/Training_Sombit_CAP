package while_loop_assignments;

public class Digit_in_Number {

	public static void main(String[] args) {
		int num=123,count=0,n=num;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println("Number of digits in the number "+n+" is "+count);
	}

}
