package testing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class Stack_Implementatiom {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("========toString============");
		System.out.println(stack); //stack overridden the toString() method of abstract Collection.
		System.out.println("========Size============");
		System.out.println(stack.size());
		System.out.println("=========For===========");
		
		for (int i=0;i<stack.size();i++) {
			System.out.println(stack.get(i));
			
		}
		System.out.println("==========For each==========");
		
		for (Integer i:stack) {
			System.out.println(i);
			
		}
		System.out.println("=========Peek===========");
        //Looks at the object at the top of this stack without removing it from the stack.
		
		for (int i=0;i<stack.size();i++) {
			System.out.println(stack.peek());
			
		}
		System.out.println(stack.isEmpty());
		System.out.println("==========Pop==========");
		List<Integer> li=new ArrayList<Integer>();
		while(!stack.isEmpty())
		{
			li.add(stack.pop());
		}
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		
		System.out.println("====================");
		
		//stack.pop(); //java.util.EmptyStackException

	}

}
