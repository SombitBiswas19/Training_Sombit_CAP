package collection_framework;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Implementation_of_Queue {

	public static void main(String[] args) {
		Queue priority_queue=new PriorityQueue();
		priority_queue.add("hamba"); //used for inserting an element and give exception if full
		priority_queue.add("hambi");
		// java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
		//(java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
		//priority_queue.add(98);
		//priority_queue.add(98);
		//priority_queue.add(true);
		priority_queue.offer("hambi"); //Safe insertion and give false if full
		
		priority_queue.remove(); //used for deletion of an element and give exception if empty
		priority_queue.poll(); //Safe deletion and give false if empty
		
		System.out.println("-------------------");
		
		Deque deque=new ArrayDeque();
		
		deque.add("yoyo");
		deque.offer("horipodo");
		deque.addFirst(5);
		deque.addLast(5);
		
		System.out.println(deque);
		deque.remove();
		System.out.println(deque);
		deque.poll();
		System.out.println(deque);
		deque.pollFirst();
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);
		deque.removeFirst(); //throws exception
		System.out.println(deque);
	}

}
