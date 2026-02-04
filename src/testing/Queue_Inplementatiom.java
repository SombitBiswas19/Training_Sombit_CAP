package testing;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Inplementatiom {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue);
		
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		//System.out.println(queue.remove()); // java.util.NoSuchElementException
//		System.out.println(queue.peek()); //null
		
		for(int element:queue)
		{
			System.out.println(element);
		}
		System.out.println("==================");
		while(!queue.isEmpty())
			//Retrieves and removes the head of this queue, or returns null if this queue is empty.
			System.out.println(queue.poll());
	}

}
