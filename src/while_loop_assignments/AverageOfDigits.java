package while_loop_assignments;

public class AverageOfDigits {

	public static void main(String[] args) {
		int num=1231,sum=0,count=0,n=num;
		while(num>0)
		{
			sum+=(num%10);
			count++;
			num/=10;
		}
		float avg=(float)sum/count;
		System.out.println("Average of digits in the number "+n+" is "+avg);

	}

}
