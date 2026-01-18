package abstraction;

public class Driver {

	public static void main(String[] args) {
		Game g=new Cricket();
		g.start();
		g.end();
		g.play();
		System.out.println("---------------");
		
		Game g1=new Football();
		g1.start();
		g1.end();
		g1.play();
		System.out.println("---------------");
		
		Bank b1=new SBI();
		b1.getInterestRate();
		System.out.println("---------------");
		Bank b2=new HDFC();
		b2.getInterestRate();
		System.out.println("---------------");

		
		Shape s1=new Circle();
		s1.area();
		s1.display();
		System.out.println("---------------");
		Shape s2=new Rectangle();
		s2.area();
		s2.display();
		System.out.println("---------------");
	}

}
