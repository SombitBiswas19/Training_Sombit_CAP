package inheritance.supercall_statement;

public class Employee extends Human {
	int id;
	double salary;
	
	public Employee(String name,int age,char gender,int id, double salary)
	{
		super(name,age,gender);
		this.id=id;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e=new Employee("Sombi",21,'M',1,25000.50f);
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.id);
		System.out.println(e.salary);
	}
}
