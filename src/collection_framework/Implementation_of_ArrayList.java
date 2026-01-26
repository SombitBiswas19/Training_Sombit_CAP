package collection_framework;

import java.util.ArrayList;

public class Implementation_of_ArrayList {
	public static void main(String[] args) {
		// generic-. same type element<Datatype>
		// non-generic -> different type element

		ArrayList<String> a1 = new ArrayList<String>(); // generic

		// OR

		// List<String> list=new ArrayList<>(); //upcasting and generic

		ArrayList a11 = new ArrayList(10); // non-generic -> here we can give initial capacity(not mandatory)

		int a = 99;
		a11.add(a); // auto boxing

		ArrayList_add_methods(a1);
		ArrayList_add_methods(a11, a1);
		ArrayList_update_methods(a11, a1);
		ArrayList_deletion_methods(a11, a1);

		// Returns true if this list contains the specified element.
		System.out.println("Contanins: "+a11.contains("hamba"));
		// This implementation iterates over the specified collection,checking each
		// element returned by the iterator
		// in turn to see if it's contained in this collection.
		System.out.println("Contanins All: "+a11.containsAll(a1));
		// Returns the element at the specified position in this list.
		System.out.println("Get: "+a11.get(6));
		// get first element
		System.out.println("Get first: "+a11.getFirst());
		// get last element
		System.out.println("Get last: "+a11.getLast());
		// Returns the index of the first occurrence of the specified element
		// in this list, or -1 if this list does not contain the element.
		System.out.println("indexOf: "+a11.indexOf(12));
		// Returns the index of the last occurrence of the specified element in this
		// list,
		// or -1 if this list does not contain the element.
		System.out.println("LastindexOf: "+a11.lastIndexOf('g'));
		// Returns the number of elements in this list.
		System.out.println("Size: "+a11.size());
		// The implementation in this interface returns a reverse-ordered List view.
		System.out.println("Reverse: "+a11.reversed());
		// Returns a view of the portion of this list between the specified fromIndex,
		// inclusive, and toIndex, exclusive.
		System.out.println("Sublist: "+a11.subList(0, 6));
		// Removes all of the elements from this list. The list will be empty after this
		// call returns.
		a11.clear();
		// Returns true if this list contains no elements.
		System.out.println("Empty: "+a11.isEmpty());
	}

	private static void ArrayList_add_methods(ArrayList a11) {
		// Appends the specified element to the end of this list.
		a11.add(126843);
		a11.add(3423.6789);
		a11.add("HIghesjgfhI");
		a11.add('k');
		// Inserts the specified element at the specified position in this list.
		a11.add(1, 236876);
		a11.add(2, "Byeeeeeee");
		// Add at first position means 0th position.
		a11.addFirst('u');
		// Add at last position means 0th position.
		a11.addLast("6thhjguy");

		System.out.println(a11);

	}

	private static void ArrayList_add_methods(ArrayList a11, ArrayList<String> a1) {
		// Appends the specified element to the end of this list.
		a11.add(12);
		a11.add('g');
		a11.add(34.6789);
		a11.add("HII");
		a11.add('g');
		// Inserts the specified element at the specified position in this list.
		a11.add(1, 876);
		a11.add(2, "Bye");
		// Add at first position means 0th position.
		a11.addFirst('v');
		// Add at last position means 0th position.
		a11.addLast("6thy");
		// Appends all of the elements in the specified collection to the end of this
		// list,
		// in the order that they are returned by the specified collection's Iterator.
		a11.addAll(a1);
		// Inserts all of the elements in the specified collection into this list,
		// starting at the specified position.
		a11.addAll(2, a1);

		System.out.println(a11);

	}

	private static void ArrayList_update_methods(ArrayList a11, ArrayList<String> a1) {
		a11.set(1, 646);
		a11.set(5, "HBP");
		a11.set(4, a1);

		System.out.println(a11);
	}

	private static void ArrayList_deletion_methods(ArrayList a11, ArrayList<String> a1) {
		// Removes the element at the specified position in this list.
		a11.remove(0);
		// Removes the first occurrence of the specified element from this list,if it is
		// present.
		// If the list does not contain the element, it is unchanged. More formally,
		// removes the element with the lowest index
		a11.remove(a1);
		// Removes from this list all of its elements that are contained in the
		// specified collection.
		a11.removeAll(a1);
		a11.removeFirst();
		a11.removeLast();

		System.out.println(a11);
	}

}
