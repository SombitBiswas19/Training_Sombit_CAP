package variable_argument;

public class Example {

	public static void main(String[] args) {
		add();
		add(5,10,15,20);
		add(1,2);
        
		System.out.println(concat("Sombit"," ","Biswas"));
		
		System.out.println(maxd(1.25,2.56,8.99));
	}
	
	public static int add(int ... n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static int sub(String k,int... n) // Varargs should be last formal argument and in FA it should contain only one varagrs
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static String concat(String ... s)
	{
		String ans="";
		for(String i:s)
		{
			ans+=i;
		}
		return ans;
	}
	
	public static double maxd(double ... n)
	{
		double big=n[0];
		for(double i:n)
		{
			if(big<i)
			{
				big=i;}			
		}
		return big;
	}

}
