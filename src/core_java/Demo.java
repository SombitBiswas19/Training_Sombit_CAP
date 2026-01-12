package core_java;

public class Demo {
	
	public static void main(String[] args) {
		int a=10;
		long b=a; //widening
		System.out.println(b);
		
		long c=20;
		int d=(int)c;
		System.out.println(d); //na
		
		double dl=55.55;
		int il=(int)dl; //na
		System.out.println(il);
		
		byte a1=10;
		float b1=a1;
		System.out.println(b1);
		
		float a2=10.111f;
		int b2=(int)a2;
		System.out.println(b2);
		
		char a3='a';
		int b3=a3;
		System.out.println(b3);
		
		int a4=100;
		char b4=(char)a4;
		System.out.println(b4);
	}

}
