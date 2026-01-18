package abstraction;

public class JuniorDeva extends Deva{
	public void goldloan()
	{
		System.out.println("Junior Deva paid gold loan");
	}
	
	public void bike()
	{
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		JuniorDeva jd=new JuniorDeva();
		jd.homeloan();
		jd.goldloan();
		jd.bike();
		
		//Upcasting
		Parent p=new JuniorDeva();
		//When we are creating child object
		p.homeloan(); //child overrides parent member.
		p.goldloan();
		//p.bike(); Child method can't access
		
		Deva d=new JuniorDeva();
		//deva overrides homeloan and jd overrides goldloan
		//but juniordeva already paid homeloan so shows same output
		//only overriden method it is using.
		d.goldloan();
		d.homeloan();
		//d.bike();//Child method can't access
	}
}
