package while_loop_assignments;

public class NumberOfZero_in_number {

	public static void main(String[] args) {
		int num=12034050,zero_count=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			if(rem==0)
				zero_count++;
			num/=10;
		}
		System.out.println("Number of zeros in the number "+n+" is "+zero_count);

	}

}
