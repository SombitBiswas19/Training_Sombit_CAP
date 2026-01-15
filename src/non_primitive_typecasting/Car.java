package non_primitive_typecasting;

public class Car extends Vehicle {
	public void Number_of_passenger(){
		System.out.println("I have 4 Passengers");
	}
	public static void main(String[] args) {
		Car c=new Car();
		Vehicle v=c; //upcasting
		v.travel();
		//v.Number_of_passenger();//cannot access this //CTE
		c=(Car)v; //Downcasting
		c.travel();
		c.Number_of_passenger();
		
	}
}
