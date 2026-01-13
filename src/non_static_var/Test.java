package non_static_var;

public class Test {
	{
		System.out.println("NS1"); // Then Non static block this will run
	}
	static{
		System.out.println("S1");  // static run first
	}

	public static void main(String[] args) {
		Test t=new Test();  // 3rd step Object creation
		Test t1=new Test(); // Bcz static run once, for now only non static block will run again bcz for that object created.

	}
	static{
		System.out.println("S2"); // this static gets executed in 2nd position
	}

}
