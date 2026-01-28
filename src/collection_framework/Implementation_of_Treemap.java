package collection_framework;
import java.util.TreeMap;
public class Implementation_of_Treemap {
	public static void main(String[] args) {
		TreeMap<String,Integer> map1=new TreeMap<String,Integer>(); //generic
		
		map1.put("Alu",9);
		map1.put("xyz",66);
		map1.put("Abc",99);
		map1.put("abc",67); //overwrite map.put(66, "xyz");
		
		System.out.println(map1);
		System.out.println(map1.get("Alu"));
		System.out.println(map1);
		System.out.println(map1.remove("abc"));
		System.out.println(map1);
		System.out.println(map1.remove("Abc",2));
		System.out.println(map1);


		
		System.out.println(map1.containsKey("Alu"));
		System.out.println(map1.containsValue(99));
		System.out.println(map1.keySet()); //set of keys
		System.out.println(map1.values()); // set of values
	}
}
