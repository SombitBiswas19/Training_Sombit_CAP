package inheritance;

public class Animal {
	String name;
	String color;
	int no_of_legs;

	public void PrintAnimal() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(no_of_legs);
	}

	public static void main(String[] args) {
		Dog doggu = new Dog("Dogesh Vai", "Black", 4);
		doggu.PrintAnimal();
	}

}

class Dog extends Animal {
	Dog(String name, String color, int no_of_legs) {
		this.name = name;
		this.color = color;
		this.no_of_legs = no_of_legs;
	}

}
