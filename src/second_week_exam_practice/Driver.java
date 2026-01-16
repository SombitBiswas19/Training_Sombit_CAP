package second_week_exam_practice;

public class Driver {

	public static void main(String[] args) {
		ElectronicDevice e=new ElectronicDevice("Samsung");
		Mobile m=new Mobile("MI",81);
		SmartPhone sp=new SmartPhone("VIVO",90,"Android");
		
		//Upcasting-> coverting child object to parent reference
		ElectronicDevice e1_up=new Laptop("HP",80000,"Ryzen");
		/*
		   Reference type: ElectronicDevice
           Actual object (runtime): Laptop
           Object in memory is Laptop
         */
		//Now we cannot access child member
		e1_up.brand="Lenovo";
		e1_up.powerOn();
		//Downcasting-> It can access child member
//Downcasting is allowed ONLY when the object is actually created from that class or its subclass.
		Laptop l=(Laptop)e1_up;
		/*
		 e1_up actually refers to a Laptop object.
         So casting ElectronicDevice → Laptop is valid.
		 */
		l.brand="DELL";
		l.price=65000;
		l.processor="INTEL";
		l.powerOn();
		
		//ClassCast Exception
		/*What Java checks at runtime:
		“Is the object referred by e1_up an instance of Mobile?”
		They are siblings, not parent-child.
		*/
		System.out.println(e1_up instanceof ElectronicDevice);
		System.out.println(e1_up instanceof Laptop);
		System.out.println(e1_up);
		System.out.println(e1_up instanceof Mobile);
		Mobile m1=(Mobile)e1_up;
		m1.battery=67;
		m1.brand="MI";
		m1.call();
		m1.powerOn();
		
		//java.lang.ClassCastException: class second_week_exam_practice.Laptop 
		//cannot be cast to class second_week_exam_practice.
		//Mobile (second_week_exam_practice.Laptop and second_week_exam_practice.Mobile are 
		//in unnamed module of loader 'app')
		//at second_week_exam_practice.Driver.main(Driver.java:23)

	}

}
