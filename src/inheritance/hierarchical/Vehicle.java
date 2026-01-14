package inheritance.hierarchical;

public class Vehicle {
	String color;
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		//System.out.println(v.brand); // Can't access child class variable
		System.out.println(v.color);
		//System.out.println(v.price); // Can't access child class variable
	}
}
