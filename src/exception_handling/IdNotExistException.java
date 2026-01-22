package exception_handling;

public class IdNotExistException extends RuntimeException {
	
	int id;
	
	public IdNotExistException(String message)
	{
		super(message);
	}
	
	public static void checkId(int id)
	{
		if(id>0)
		{
			System.out.println(id+" is valid.");
		}
		else
		{
			throw new IdNotExistException(id+" id is invalid.");
		}
	}
	
	
}
