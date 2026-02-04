package testing;

public class Stack_Creation_Manually {
	int[] stack;
	int size;
	int top;
	
	public Stack_Creation_Manually(int size)
	{
		stack=new int[size];
		top=-1;
		this.size=size;
	}
	
	public boolean isempty()
	{
		return size==0;
	}
	public boolean isfull()
	{
		return top==size-1;
	}
	
	public int push(int element)
	{
		if(isfull())
		{
			throw new RuntimeException("Stack Overflow.");
		}
		stack[++top]=element; //because initially it is in -1 if we do pre-increment to make it 0
		return element;
	}
	
	public int pop()
	{
		if(isempty())
		{
			throw new RuntimeException("Stack Underflow.");
		}
		int element=stack[top--];
		return element;
	}
	
	public int size()
	{
		return top++;
	}
}


