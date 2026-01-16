package polymorphism.runtime;

public class Driver {

	public static void main(String[] args) {
		MapV1 map1=new MapV1();
		map1.route();
		MapV2 map2=new MapV2();
		map2.route();
		MapV3 map3=new MapV3();
		map3.route();
		map3.bookcab();
		
		MapV1 map11=new MapV1();
		map11=map3; //Upcasting and oerriding that's why based on object type it is printing
		map11.route();
		
		MapV3 map33=new MapV3();
		map33=(MapV3)map11; //Downcasting 
		map33.route();
		map33.bookcab();
		
		MapV2 map22=(MapV2)map11; //Note
		map22.route();
		
		

	}

}
