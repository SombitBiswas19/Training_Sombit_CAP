package array_basic;
import java.util.Scanner;

public class ArrayInitialization_And_Print {
	public static void int_array(int [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(a.length);
		System.out.println("-----------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			a[i]=sc.nextInt();
		}
		System.out.println(" Integer Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------Integer Array End--------");
	}
	
	public static void char_array(char [] c)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(c.length);
		System.out.println("-----------------");
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			c[i]=sc.next().charAt(0);
		}
		System.out.println(" Character Array Elements:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		System.out.println("-------Character Array End--------");
	}
	
	public static void bool_array(boolean [] b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(b.length);
		System.out.println("-----------------");
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			b[i]=sc.nextBoolean();
		}
		System.out.println(" Boolean Array Elements:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("-------Boolean Array End--------");
	}
	
	public static void string_array(String [] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(s.length);
		System.out.println("-----------------");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			s[i]=sc.next();
		}
		System.out.println(" String Array Elements:");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("-------String Array End--------");
	}
	
	public static void sum_int_array()
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer array size:");
		int[] a=new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			a[i]=sc.nextInt();
		}
		System.out.println(" Sum:");
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		System.out.println(sum);
	}
	
	public static void sum_even_odd_int_array()
	{
		int sum_even=0,sum_odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer array size:");
		int[] a=new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" th element of Array");
			a[i]=sc.nextInt();
		}
		System.out.println(" Sum:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum_even+=a[i];
			}
			else
				sum_odd+=a[i];
			
		}
		System.out.println(sum_even);
		System.out.println(sum_odd);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer array size:");
		int[] a=new int[sc.nextInt()];
		int_array(a);
		
		System.out.println("-----------------");
		System.out.println("Enter the character array size:");
		char[] c=new char[sc.nextInt()];
		char_array(c);
		
		System.out.println("Enter the boolean array size:");
		boolean[] b=new boolean[sc.nextInt()];
		bool_array(b);
		
		System.out.println("Enter the string array size:");
		String[] s=new String[sc.nextInt()];
		string_array(s);
		
		sum_int_array();
		sum_even_odd_int_array();
		
	}
}
