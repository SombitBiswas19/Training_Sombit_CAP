package implementation_of_object_class;

import java.util.Objects; //utility class not Same as Object class

public class Example {
	{
		System.out.println(this); // this means printing the object address
		// internally calls this.toString()
	}
	int id;
	String name;

	Example(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	// In parent class it is printing address but
	// here after overriding we are printing the states of the child class.
	public String toString() {
		return "id: " + id + " name: " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name); // generate same address if they has same id and name
	}

	@Override
	public boolean equals(Object o) {
		if(o==null || o.getClass()!=this.getClass())
			return false;
		Example e = (Example) o; //Downcasting
		return this.id==e.id && this.name==e.name;
	}

	public static void main(String[] args) {
		Example e = new Example(10, "XYZ");
		Example e2 = new Example(11, "XYZ");
		// packagename.classname ->known as fully qualified classname.
		// Address of the object in packagename.classname@hex_val format
		System.out.println(e.toString()); // It is using parent class's member, parent is Object class
		// here e automatically converts into e.toString() internally
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());

		Example e1 = e;

		// same hashcode is generating
		System.out.println(e1.hashCode()); // address of object e is stored in e1

		// Before Overriding
		System.out.println(e.equals(e1)); // compares the address of e and e1 //true
		System.out.println(e.equals(e2)); // compares the address of e and e2 //false

		// After Overriding
		System.out.println(e.equals(e1)); // compares the address of e and e1 //true
		System.out.println(e.equals(e2)); // compares the address of e and e2 //false
		
		Example e4=null;
		// java.lang.NullPointerException: Cannot invoke "implementation_of_object_class.Example.equals(Object)" because "e4" is null
		//System.out.println(e4.equals(e1)); 
		System.out.println(e1.equals(e4)); //false
		
		System.out.println(e1.getClass()); //return the packagename.classname or fully qualified classname
		
		Employee emp=new Employee(1,"som",758,"IT");
		//Incompatible operand types Class<capture#2-of ? extends Example> 
		//and Class<capture#3-of ? extends Employee>
		//at implementation_of_object_class.Example.main(Example.java:71)
		//System.out.println(e1.getClass()==emp.getClass());
		System.out.println(e1.getClass()==e.getClass());
		
		Object o=new Example(109, "XYZA");
		System.out.println(o.getClass());
		System.out.println(emp.equals(o));
		
		
		
		
		
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Example Example1=new Example(10, "XYZ");
		Example Example2=new Example(10, "XYZ");
		Employee Employee1=new Employee(10, "XYZ",637,"iT");
		Employee Employee2=new Employee(11, "XYZA",6367,"iT");
		
		Object obj=new Employee(112, "XYZAB",63657,"iT");
		
		System.out.println(Example1.equals(Example2));
		System.out.println(Example1.equals(Employee1));
		System.out.println(Example1.equals(Employee2));
		System.out.println("===================");
		System.out.println(Example2.equals(Example1));
		System.out.println(Example2.equals(Employee1));
		System.out.println(Example2.equals(Employee2));
		System.out.println("===================");
		System.out.println(Employee1.equals(Example1));
		System.out.println(Employee1.equals(Example2));
		System.out.println(Employee1.equals(Employee2));
		System.out.println("===================");
		System.out.println(Employee2.equals(Example1));
		System.out.println(Employee2.equals(Example2));
		System.out.println(Employee2.equals(Employee1));
		System.out.println("===================");
	}
}
