package has_a_relationship;

public class Person {
	String name;
	Pan_card pancard;
	
	public static void main(String[] args) {
		Person person=new Person();
		person.name="Dinga";
		Pan_card card=new Pan_card();
		card.panid="ABC123";
		card.dob="14/04/2001";
		
		person.pancard=card;
		
		System.out.println(person.name);
		System.out.println(person.pancard.panid);
		System.out.println(person.pancard.dob);
	}
}
