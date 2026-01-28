package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterable_Implementation {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator<Integer> i=list.listIterator(); //used only for list,queue,array
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(" =========================== ");
		ListIterator<Integer> li=list.listIterator();
		li.add(10);
		li.add(20);
		li.add(30);

		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
