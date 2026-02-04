package dsa_stack_queue;

import java.util.ArrayDeque;

public class StackUsingDeque {
    static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
