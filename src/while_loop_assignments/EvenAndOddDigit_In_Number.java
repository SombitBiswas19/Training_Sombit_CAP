package while_loop_assignments;

public class EvenAndOddDigit_In_Number {

	public static void main(String[] args) {
		int num=1234567890,even_count=0,odd_count=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				even_count++;
			else
				odd_count++;
			num/=10;
		}
		System.out.println("Number of odd digits in the number "+n+" is "+odd_count);
		System.out.println("Number of even digits in the number "+n+" is "+even_count);

	}

}
