package non_static_var;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	
	public void work()
	{
		System.out.println(name +" is working");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of objects needed");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Employee e=new Employee();
			System.out.println("Enter the id");
			e.id=sc.nextInt();	
			System.out.println("Enter the name");
			sc.nextLine();
			e.name=sc.nextLine();	
			System.out.println("Enter the salary");
			e.salary=sc.nextDouble();	
			System.out.println(e.id +" "+e.name+" "+e.salary);
		}
		
	}

}
