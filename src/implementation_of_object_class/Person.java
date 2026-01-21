package implementation_of_object_class;

/*
 * Person class implicitly extends the Object class.
 * Every class in Java is a child of Object class by default.
 */
public class Person {

	// Instance variables to store person details
	int id;
	String name;

	/* Constructor to initialize Person object 'this' keyword refers to the current object  */
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		// Creating two Person objects
		Person p1 = new Person(1, "Ami");
		Person p2 = new Person(1, "Tui");

		// Using built-in methods of Object class (java.lang.Object)
		System.out.println("Printing P1 data:");

		// toString() method returns the class name + hash code (not actual memory address)
		System.out.println(p1.toString());

		// Internally calls p1.toString()
		System.out.println(p1);
		
		/*
		 * '==' operator compares object references (memory location).
		 * p1 and p2 refer to different objects, so it returns false.
		 */
		System.out.println(p1 == p2);

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
	}
}
