package array_basic;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Sorted integer array size:");
		int[] a = new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " th element of Array");
			a[i] = sc.nextInt();
		}

		duplicate_elements(a);

	}

	private static void duplicate_elements(int[] a) {
		int n=a.length;
		int[] freq=new int[n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1)
				freq[i]=count;
		}
		
		for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1 && freq[i]>=2) {
                System.out.println("   " + a[i] + " -> " + freq[i]);
            }
        }
	}

}
