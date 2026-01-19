package has_a_relationship;

public class Human {
	private Heart heart;
	private Address address;
	public Human()
	{
		heart=new Heart(); //strong relationship composition
	}
	public Heart getHeart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		Human human=new Human();
		human.getHeart().pump();
		//loose coupling so we have to create object of Address
		//human.getAddress().location(); // java.lang.NullPointerException
		Address address=new Address();
		human.setAddress(address);
		human.getAddress().location();
	}
}

class Heart{
	public void pump()
	{
		System.out.println("Heart is pumping");
	}
}
class Address{
	public void location()
	{
		System.out.println("India");
	}
}