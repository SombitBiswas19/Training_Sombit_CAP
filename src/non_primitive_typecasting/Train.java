package non_primitive_typecasting;

public class Train extends Vehicle {
	public void Ticket_price(){
		System.out.println("Ticket Price 350 Rs. only");
	}
	public static void main(String[] args) {
		Train t=new Train();
		Vehicle v=t; //upcasting
		v.travel();
		//v.Number_of_passenger();//cannot access this //CTE
		//Car c=(Car)v; //Downcasting ->ClassCastException
		//t.travel();
		//t.Number_of_passenger();
	}
}
