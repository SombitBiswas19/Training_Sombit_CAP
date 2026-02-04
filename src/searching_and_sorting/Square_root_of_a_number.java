package searching_and_sorting;

public class Square_root_of_a_number {

	public static void main(String[] args) {
		int num=225;
		
		int low=2,high=num/2;
		
		for(int i=low;i<=high;i++)
		{
			if(i*i==num)
			{
				System.out.println("Square root of "+num+" is: "+i);
				return;
			}
		}
		System.out.println("No square root found");

	}
	
	public static int square_root(int num)
	{
		int low=1,high=num;
		while(low<=high)
		{
			int mid=low+((high-low)/2);
			if(mid*mid<=num) //mid*mid can do overflow so you can change the type to long
			{
				return mid;
			}
			low=mid+1;
		}
		return -1;
	}

}
