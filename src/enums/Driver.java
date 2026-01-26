package enums;

public class Driver {
	public Day day; //Enum acting like variable
	public static void main(String[] args) {
		System.out.println(Day.Fri);
		
		Day d=Day.Tue;
		System.out.println(d);
		
		Driver dry=new Driver();
		dry.day=Day.Mon;
	}
}
