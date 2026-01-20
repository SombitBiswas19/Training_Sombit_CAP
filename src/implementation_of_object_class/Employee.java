package implementation_of_object_class;
import java.util.Objects;
import java.util.Scanner;
public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	@Override
	public String toString()
	{
		return "id:"+id+" name:"+name+" salary:"+salary+" department:"+department;
	}


	Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name,salary,department);  
	}
	
	public static boolean checkcontent(Employee e1,Employee e2)
	{
		if(e1.hashCode()==e2.hashCode())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object o) {
		if(o==null || o.getClass()!=this.getClass())
			return false;
		Employee e = (Employee) o; 
		return this.id==e.id && this.name==e.name;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of employees you want to add: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee[] emp=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Employee "+i);
			System.out.println("Enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter department");
			String department=sc.nextLine();
			emp[i]=new Employee(id,name,salary,department);
		}
		System.out.println("================+++++++++++++===============");
		for(Employee employee:emp)
		{
			System.out.println("toString()");
			System.out.println(employee.toString());
			System.out.println("hashCode()");
			System.out.println(employee.hashCode());
			System.out.println("===================");
		}
		System.out.println(emp[0].equals(emp[1]));
		System.out.println(emp[0].equals(emp[2]));
		System.out.println(emp[1].equals(emp[0]));
		System.out.println(emp[1].equals(emp[2]));
		System.out.println(emp[2].equals(emp[0]));
		System.out.println(emp[2].equals(emp[1]));
		
		System.out.println("Same content of not: "+checkcontent(emp[0],emp[1]));
	}
}
