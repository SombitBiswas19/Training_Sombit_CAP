package searching_and_sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void optimized_bubblesort(int[] arr)
	{
		int n=arr.length;
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=true;  
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==false) //checks swapping is already happened or not. if happens the flag will be true.
			{
				break;
			}
		}
	}
	public static void bubblesort(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,8,6,3,0}; 
		int[] arr1= {1};
		int[] arr2= {};
		int[] arr3= {97,989888,993,76770,90097,1,0,7298};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
		bubblesort(arr1);
		System.out.println(Arrays.toString(arr1));
		bubblesort(arr2);
		System.out.println(Arrays.toString(arr2));
		bubblesort(arr3);
		System.out.println(Arrays.toString(arr3));
		
	}

}
