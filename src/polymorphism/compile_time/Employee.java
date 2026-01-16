package polymorphism.compile_time;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	Employee(int id)
	{
		this.id=id;
	}
	Employee(int id,String name)
	{
		this(id);
		this.name=name;
	}
	Employee(int id,String name,double salary)
	{
		this(id,name);
		this.salary=salary;
	}
	Employee(int id,String name,double salary,String department)
	{
		this(id,name,salary);
		this.department=department;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(1);
		Employee e2=new Employee(2,"Sombit");
		Employee e3=new Employee(3,"Arnab",30000.45);
		Employee e4=new Employee(4,"Sahil",32000.56,"IT");
		
		System.out.println("------E1-------");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.department);
		System.out.println("------E2-------");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e2.department);
		System.out.println("------E3-------");
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		System.out.println(e3.department);
		System.out.println("------E4-------");
		System.out.println(e4.id);
		System.out.println(e4.name);
		System.out.println(e4.salary);
		System.out.println(e4.department);
	}
}
