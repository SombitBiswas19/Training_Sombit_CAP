package second_week_exam_practice;

public class Laptop extends ElectronicDevice {
	double price;
	String processor;
	
	public Laptop(String brand,double price,String processor){
		super(brand);
		this.price=price;
		this.processor=processor;
	}
}
