package collection_framework;
import java.util.Stack;

public class Implementation_of_Stack {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		Stack s2=new Stack();

		s1.add(1);
		s1.add(50);
		s1.add(30);
		s1.add(3, 345);
		
		s2.add(23);
		s2.addFirst('c');
		s2.addLast("hamba");
		s2.add(true);
		s2.add(4,"hambaaaa");
		s2.addAll(s1);
		s2.addAll(3, s2);
		s2.addElement(3456);
		System.out.println(s2.contains(50)); 
		System.out.println(s2.containsAll(s1)); 
		System.out.println(s2.elementAt(0));
		System.out.println(s2.empty());
		System.out.println(s2.firstElement());
		System.out.println(s2.lastElement());
		System.out.println(s2.get(8));
		System.out.println(s2.getFirst());
		System.out.println(s2.getLast());
		System.out.println(s2.indexOf("hamba"));
		System.out.println(s2.isEmpty());
		System.out.println(s2.lastIndexOf(30));
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.push(s1));
		s2.remove(2);
		s2.remove(s1);
		s2.removeElement("hamba");
		s2.removeElementAt(4);
		s2.removeFirst();
		s2.removeLast();
		System.out.println(s2.reversed()); 
		System.out.println(s2.search(34));
		s2.set(0,9876);
		System.out.println(s2.size());
		System.out.println(s2.elements());
		
	}

}
