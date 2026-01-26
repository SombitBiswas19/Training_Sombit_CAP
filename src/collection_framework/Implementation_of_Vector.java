package collection_framework;

import java.util.Vector;

public class Implementation_of_Vector {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		Vector v11 = new Vector();
		v11.add("hieihdgfj");
		v11.add(547732.9);
		v11.add(false);

		v1.add("hiei");
		v1.add(5472.9);
		v1.add(true);
		v1.add(1, v11);

		v1.addAll(v11);
		v1.addAll(0, v11);

		v1.addElement("yoyo");

		v1.addFirst("hambaaa");
		v1.addLast("dingi");

		System.out.println(v1.elementAt(0));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());

		System.out.println(v1.contains(false));
		System.out.println(v1.containsAll(v11));
		System.out.println(v1.get(1));
		System.out.println(v1.getFirst());
		System.out.println(v1.getLast());
		System.out.println(v1.indexOf("hamba"));
		System.out.println(v1.lastIndexOf(v11));
		System.out.println(v1.remove(3));
		System.out.println(v1.remove(v11));
		
		System.out.println(v1.removeAll(v11));
		System.out.println(v1);
		v1.insertElementAt(v11, 1);
		v1.removeElement("hamba");
		v1.removeElementAt(3);
		v1.setElementAt(v11, 5);
		System.out.println(v1.removeFirst());
		System.out.println(v1.removeLast());
		System.out.println(v1.set(0, v11));
		
		System.out.println(v1.subList(0, 0));
		System.out.println(v1.size());
		System.out.println(v1.reversed());
		System.out.println(v1.subList(0, 2));

	}

}
