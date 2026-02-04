package dsa_stack_queue;


public class StackUsingArray {

    private int size;
    private int top;
    private int[] stack;

    public StackUsingArray(int size)
    {
        this.size=size;
        stack = new int[size];
        top=-1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public boolean isFull()
    {
        return top==size-1;
    }

    public void push(int element)
    {
        if(isFull())
        {
           //  throw new RuntimeException("Stack is already full.");
            //Dynamic Array logic
            resize();
        }
        stack[++top]=element;
    }

    private void resize() {
        int [] temp=stack;
        size=size*2;
        stack=new int[size];
        for(int i=0;i<=top;i++)
        {
            stack[i]=temp[i];
        }
    }

    public int pop() //removing the top element
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is empty.");
        }
        return stack[top--];
    }
    public int peek() //returning the top element
    {
        if(isEmpty())
        {
            throw new RuntimeException("Nothing to peek");
        }
        return stack[top];
    }

}

class StackDriver{
    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray(5);
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
        System.out.println("=========");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
