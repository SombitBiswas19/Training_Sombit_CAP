package abstraction;

public class Redmi3 extends Redmi2 {
	@Override
	public void SmartCamera()
	{
		System.out.println("Smart camera");
	}
	
	public static void main(String[] args) {
		Mobile m=new Redmi3();
		m.battery();
		m.camera();
		
		Redmi1 m1=new Redmi3();
		m1.battery();
		m1.camera();
		
		Redmi2 m2=new Redmi3();
		m2.battery();
		m2.camera();
		m2.SmartCamera();
	}
}
