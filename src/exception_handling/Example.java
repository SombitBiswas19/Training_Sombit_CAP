package exception_handling;

public class Example {
	int id;
	
	Example(int id)
	{
		this.id=id;
	}
	
	public static void main(String[] args) {
		Example e1=new Example(-1);
		
		IdNotExistException.checkId(e1.id);
	}
}
