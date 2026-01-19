package interface_implementation;

public class Driver {

	public static void main(String[] args) {
		Animal cow=new Cow();
		cow.color();
		cow.sound();
		Animal lion=new Lion();
		lion.color();
		lion.sound();
		
		//Lion l=(Lion) cow; // java.lang.ClassCastException
		

	}

}
