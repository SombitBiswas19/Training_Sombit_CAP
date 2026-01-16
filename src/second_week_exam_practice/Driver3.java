package second_week_exam_practice;

public class Driver3 {

	public static void main(String[] args) {
		App2 app=new App2();
		app.operation();
		
		WhatsApp2 wp=new WhatsApp2();
		wp.operation();
		wp.status();
		
		//Method call depends on reference type, not object type.
		//The child class method hides the parent class method.
		App2 app1=new WhatsApp2();
		app1.operation();

	}

}
