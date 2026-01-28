package collection_framework;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class Implementation_of_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap(); //non-generic
		
		map.put("key", "value");
		map.put(66, "xyz");
		map.put('a', 100);
		map.put(66, 100); //overwrite map.put(66, "xyz");
		
		System.out.println(map);
		
		HashMap<Integer,String> map1=new HashMap(); //generic
		
		map1.put(1, "value");
		map1.put(66, "xyz");
		map1.put(2, "Abc");
		map1.put(66, "abc"); //overwrite map.put(66, "xyz");
		
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.getOrDefault(5, "Raju"));
		System.out.println(map1);
		System.out.println(map1.remove(66));
		System.out.println(map1);
		System.out.println(map1.remove(2, "Abc"));
		System.out.println(map1);
		
		map1.putIfAbsent(45, "hamba");
		map1.putIfAbsent(46, "hambi");
		
		map1.replace(1, "value", "updated_value");
		System.out.println(map1);
		map1.replace(45, "hambibor");
		System.out.println(map1);
		
		System.out.println(map1.containsKey(1));
		System.out.println(map1.containsValue("hambi"));
		System.out.println(map1.keySet()); //set of keys
		Collection<String> al=map1.values();
		System.out.println(al);
		System.out.println(map1.values()); // set of values
	}

}
