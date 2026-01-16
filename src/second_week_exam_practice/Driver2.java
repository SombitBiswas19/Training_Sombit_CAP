package second_week_exam_practice;

public class Driver2 {
	public static void main(String[] args) {
		App app1=new App();
		app1.operation();
		WhatsApp wp1=new WhatsApp();
		wp1.operation();
		wp1.status();
		
		//Method call depends on object type, not reference type.
		App app2=new WhatsApp(); //Upcasting and Method Overriding
		app2.operation(); //Parent member it is. Child member just giving the implementation.
		//It also has the upcasting characteristics means Parent isn't able to use child member.
		//here app2 cannot access status method of child.
		
	}
}
