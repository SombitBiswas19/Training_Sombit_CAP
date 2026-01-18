package abstraction;

public abstract class Employee {
	int id;
	String name;
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Employee()
	{
		
	}
	
	public abstract void PrintEmployee();
	
	public static void main(String[] args) {
		Raju r=new Raju(10,"kaju",100000.05);
		r.PrintEmployee();
		System.out.println(r);
		
		Employee e=new Raju(11,"kajuuuuu",1000600.05);
		e.PrintEmployee();
		System.out.println(e);
		
	}
}
class Raju extends Employee{
	double salary;
	public Raju(int id,String name,double salary) {
		super(id,name);
		this.salary=salary;
	}
	
	public void PrintEmployee()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
}
