package testing;

import java.util.LinkedList;
import java.util.Queue;

public class ToDoApllication_queue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		queue.add("Sokale Otha");
		queue.add("Dat Maja");
		queue.add("Snan kora");
		queue.add("Khabar khawa");
		queue.add("bari theke berono");
		queue.add("bus a otha");
		queue.add("clg a asa");
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove()+" complete");
		}

	}

}
