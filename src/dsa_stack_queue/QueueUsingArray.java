package dsa_stack_queue;

public class QueueUsingArray {
    private int front; //Elements are removed from the front end, and the front pointer is incremented.
    private int rear;//Elements are added at the rear end, and the rear pointer is incremented.
    private int size;
    private int[] queue;

    public QueueUsingArray(int size)
    {
        front=-1;
        rear=-1;
        this.size=size;
        queue=new int[size];
    }
    // when front>=rear, greater than bcz for last element removal, front surpasses the rear.
    public boolean isEmpty()
    {
        return front>=rear;
    }
    public void enqueue(int element)
    {
        //increment rear by 1 and place that data on that index
        queue[++rear]=element;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Queue is empty.");
        }
        //increment front by 1 and return element of that index
        if(rear>=front)
        {
            return queue[++front];
        }
        return (Integer)null;
    }


    public int size()
    {
        return rear-front;
    }
}

class QueueDriver{
    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(5);
        System.out.println(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Size: "+queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.size());
    }
}
