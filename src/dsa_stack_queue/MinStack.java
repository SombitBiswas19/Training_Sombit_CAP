package dsa_stack_queue;

import java.util.Stack;

class MinStack {
	Stack<Integer> stack;
	Stack<Integer> min_stack;

	public MinStack() {
		stack = new Stack<>();
		min_stack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (min_stack.isEmpty() || val <= min_stack.peek())
			min_stack.push(val);
	}

	public void pop() {
		int val = stack.pop();
		if (val == min_stack.peek())
			min_stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min_stack.peek();
	}

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(12);
		obj.push(11);
		obj.push(1);
		obj.push(6);
		obj.push(5);
		obj.push(3);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();

		System.out.println(param_3);
		System.out.println(param_4);
	}
}
