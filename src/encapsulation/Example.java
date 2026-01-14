package encapsulation;

public class Example {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Sombit";
		//s.pass=1234; //Compile Time Error ->The field Student.pass is not visible
		s.setpsd(1234); //Setting password using method and accessing variable using method
		System.out.println(s.name);
		System.out.println(s.getpsd()); //Getting password using method and accessing variable using method
		
		Student s1=new Student("XYZ",123);
		System.out.println(s1.name);
		System.out.println(s1.getpsd());
		System.out.println("---------------");

		
		Trainer t=new Trainer();
		t.setid(1);
		System.out.println(t.getid());
		t.setname("Sombit");
		System.out.println(t.getname());
		t.setpassword("hamba");
		System.out.println(t.getpassword());
		System.out.println("---------------");
		
		Account ac=new Account();
		ac.setaccountid(123);
		System.out.println(ac.getaccountid());
		ac.setpassword("XYZ");
		System.out.println(ac.getpassword());
		ac.setbalance(12);
		ac.getbalance("XYZ");
		System.out.println("---------------");
		
		MobilePhone mp=new MobilePhone();
		mp.chargePhone(50);
		System.out.println("Battery Level is: "+mp.getBatteryLevel());
		mp.chargePhone(60);
		System.out.println("---------------");
		
		RailwayTicket ticket = new RailwayTicket();
        ticket.bookTicket(5);
        ticket.bookTicket(10);
        ticket.cancelTicket(3);
        System.out.println("Available Seats: " + ticket.getAvailableSeats());
	}
}
