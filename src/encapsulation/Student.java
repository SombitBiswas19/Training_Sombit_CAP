package encapsulation;

public class Student {
	String name;
	private int pass;
	
	public Student() {
		
	}

	public Student(String name, int pass) {  //Acts as setter because we don't assigning directly constructor is doing that
		this.name = name;
		this.pass = pass;
	}

	public int getpsd()
	{
		return pass;
	}
	
	public void setpsd(int pass)
	{
		this.pass=pass;
	}

	

}
