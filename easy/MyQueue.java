package easy;

import java.util.Stack;

//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support 
//all the functions of a normal queue (push, peek, pop, and empty).

public class MyQueue {
	Stack<Integer> main;
	Stack<Integer> helper;
	
	/** Initialize your data structure here. */
    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        main.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(main.size() <= 0) {
    		return -1;
    	}
        while(main.size() > 1) {
        	helper.add(main.pop());
        }
        int temp = main.pop();
        while(!helper.isEmpty()) {
        	main.add(helper.pop());
        }
        return temp;
    }
    
    /** Get the front element. */
    public int peek() {
    	if(main.size() <= 0) {
    		return -1;
    	}
        while(main.size() > 1) {
        	helper.add(main.pop());
        }
        int temp = main.peek();
        while(!helper.isEmpty()) {
        	main.add(helper.pop());
        }
        return temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return main.size() == 0;
    }
}
