package implementation_of_object_class;

public class PersonV2_override {

	// Instance variables to store person details
	int id;
	String name;

	/* Constructor to initialize Person object 'this' keyword refers to the current object  */
	PersonV2_override(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		// Creating two Person objects
		PersonV2_override p1 = new PersonV2_override(1, "Ami");
		PersonV2_override p2 = new PersonV2_override(1, "Tui");

		// Using built-in methods of Object class (java.lang.Object)
		System.out.println("Printing P1 data:");

		// toString() method returns the class name + hash code (not actual memory address)
		System.out.println(p1.toString());

		// Internally calls p1.toString()
		System.out.println(p1);

		/*
		 * equals() method compares object references by default. Since p1 and p2 are
		 * two different objects, it returns false.
		 */
		System.out.println(p1.equals(p2));

		/*
		 * hashCode() returns a unique integer value for the object. It is NOT the
		 * actual memory address, but a hash representation.
		 */
		System.out.println(p1.hashCode());
}}
