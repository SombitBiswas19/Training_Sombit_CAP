package non_static_var;

public class College {
	String name;
	String location;
	
	public static void exam(String clgname)
	{
		System.out.println(clgname+ " assigning exam.");
	}
	public static void printclg(String clgname,String loc)
	{
		System.out.println(clgname+ " situated in " + loc);
	}
	

	public static void main(String[] args) {
		College c1=new College();
		c1.name="IEM";
		c1.location="Kolkata";
		exam(c1.name);
		printclg(c1.name,c1.location);
	}

}
