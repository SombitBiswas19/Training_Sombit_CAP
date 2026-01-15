package inheritance.supercall_statement;

public class Human {
	String name;
	int age;
	char gender;
	
	public Human(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		Human h=new Human("Sombi",21,'M');
		System.out.println(h.name);
		System.out.println(h.age);
		System.out.println(h.gender);
	}
}
