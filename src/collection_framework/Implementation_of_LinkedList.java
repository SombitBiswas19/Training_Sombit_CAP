package collection_framework;
import java.util.LinkedList;

public class Implementation_of_LinkedList {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l11=new LinkedList();
		l11.add("hieihdgfj");
		l11.add(547732.9);
		l11.add(false);
		
		l1.add("hiei");
		l1.add(5472.9);
		l1.add(true);
		l1.add(1, l11);
		
		l1.addAll(l11);
		l1.addAll(0, l11);
		l1.addFirst("hambaaa");
		l1.addLast("dingi");
		System.out.println(l1.contains(false));
		System.out.println(l1.containsAll(l11));
		System.out.println(l1.get(1));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.indexOf("hamba"));
		System.out.println(l1.lastIndexOf(l11));
		System.out.println(l1.offer(123));
		System.out.println(l1.offerFirst(123234));
		System.out.println(l1.offerLast(12344444));
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1.remove());
		System.out.println(l1.remove(3));
		System.out.println(l1.remove(l11));
		System.out.println(l1.removeAll(l11));
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeFirstOccurrence(l11));
		System.out.println(l1.removeLast());
		System.out.println(l1.removeLastOccurrence(l11));
		System.out.println(l1.set(0, l11));
		System.out.println(l1.size());
		System.out.println(l1.reversed());
		System.out.println(l1.subList(0, 2));
		
		
	}
}
