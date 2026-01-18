package array_basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+i+" th element");
			arr[i]=sc.nextInt();
		}
		prime(arr);
		sc.close();
	}
	public static void prime(int [] arr)
	{
		int n=arr.length;
		
		for(int j=0;j<n;j++)
		{
			if(arr[j] <= 1)
                continue;
			boolean flag=false;
			for(int i=2;i*i<=arr[j];i++)
			{
				if(arr[j]%i==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(arr[j]+" is Prime");
			}
		}
		
	}

}
