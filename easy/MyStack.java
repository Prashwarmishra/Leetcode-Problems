package easy;

import java.util.LinkedList;
import java.util.Queue;

//Implement a last in first out (LIFO) stack using only two queues. The implemented stack should support 
//all the functions of a normal queue (push, top, pop, and empty).

public class MyStack {
	Queue<Integer> main;
	Queue<Integer> helper;
	
	public MyStack() {
		main = new LinkedList<Integer>();
		helper = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		main.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		if(main.isEmpty()) {
			return -1;
		}
		while(main.size() > 1) {
			helper.add(main.poll());
		}
		int temp = main.poll();
		while(!helper.isEmpty()) {
			main.add(helper.poll());
		}
		return temp;
	}

	/** Get the top element. */
	public int top() {
		if(main.isEmpty()) {
			return -1;
		}
		while(main.size() > 1) {
			helper.add(main.poll());
		}
		int temp = main.poll();
		while(!helper.isEmpty()) {
			main.add(helper.poll());
		}
        main.add(temp);
		return temp;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return main.size() == 0;
	}
}
