package object_creation;

public class Student {
	int id;
	String name;
	public void study() {
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s); //memory address of object reference variable
		System.out.println(s.id); //default value of id because not initialized -> 0
		System.out.println(s.name); //default value of name because not initialized -> null
		s.id=101;
		s.name="xyz";
		System.out.println(s.id);
		System.out.println(s.name);
		s.study();
	}

}
