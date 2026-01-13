package this_keyword;



public class Employee {
	int id;
	String name;
	double salary;
	public void initialize(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public void work()
	{
		System.out.println(name +" is working");
	}
	
	public static void main(String[] args) {
			Employee e=new Employee();
			e.initialize(1,"hamba",10.0);
			e.display();
			e.work();
		
	}

}
