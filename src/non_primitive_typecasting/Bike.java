package non_primitive_typecasting;

public class Bike extends Vehicle {
	public void Top_speed(){
		System.out.println("Top speed 150km/hr");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		Vehicle v=b; //upcasting
		v.travel();
		//v.Number_of_passenger();//cannot access this //CTE
		b=(Bike)v; //Downcasting
		b.travel();
		b.Top_speed();;
	}
}
