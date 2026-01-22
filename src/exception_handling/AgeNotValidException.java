package exception_handling;

public class AgeNotValidException extends RuntimeException{
	
	public AgeNotValidException(String message)
	{
		super(message);
	}
	
	public static void checkAge(int age)
	{
		if(age>0)
		{
			System.out.println(age+" is valid.");
		}
		else
		{
			throw new AgeNotValidException(age+" is invalid.");
		}
	}
	
	public static void main(String[] args) {
		int age1=10;
		checkAge(age1);
		int age2=-10;
		try {
			checkAge(age2);
		}
		catch(AgeNotValidException exp)
		{
			System.out.println("Age Exception Handled.");
		}
		
	}
}
