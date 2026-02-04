package testing;

public class CustomQueue {
	private int size;
	private int [] queue;
	private int front;
	private int rear;
	
	public CustomQueue(int size)
	{
		this.size=size;
		queue=new int[size];
		this.front=0;
		this.rear=-1;
	}
	
	public boolean isFull()
	{
		return rear==size-1;
	}
	
	public void enqueue(int element)
	{
		if(isFull())
		{
			throw new RuntimeException("Queue is full.........");
		}
		queue[++rear]=element;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Queue is Empty.........");
		}
		return queue[front++];
	}

	public boolean isEmpty() {
		return front>rear;
	}
	
	public int size()
	{
		return rear+front-1;
	}
	
	public int peek() {
		if(isEmpty())
		{
			throw new RuntimeException("Queue is Empty.........");
		}
		return queue[front];
	}
}
