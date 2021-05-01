package medium;

//Design your implementation of the circular queue. 

public class MyCircularQueue {
	
	int[] data;
	int front, rear, size;
	
	public MyCircularQueue(int k) {
		data = new int[k];
		front = rear = -1;
	}

	public boolean enQueue(int value) {
		if(front == -1) {
			front++;
		}
		if(size >= data.length) {
			return false;
		}
		rear = (rear + 1) % data.length;
		size++;
		data[rear] = value;
		return true;
	}

	public boolean deQueue() {
		if(size <= 0) {
			return false;
		}
		front = (front + 1) % data.length;
		size--;
		if(size == 0) {
			front = rear = -1;
		}
		return true;
	}

	public int Front() {
		if(size == 0) {
			return -1;
		}
		return data[front];
	}

	public int Rear() {
		if(size == 0) {
			return -1;
		}
		return data[rear];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == data.length;
	}

}
