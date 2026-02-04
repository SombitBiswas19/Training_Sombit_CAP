package dsa_stack_queue;

public class MyCircularQueue {
    private int[] queue;
    private int front, rear, size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = k;
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        // If queue is empty, initialize front to 0
        if (isEmpty()) front = 0;

        // Circularly increment rear and insert
        rear = (rear + 1) % size;
        queue[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        // If there was only one element, reset to empty state
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Circularly increment front
            front = (front + 1) % size;
        }
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}
