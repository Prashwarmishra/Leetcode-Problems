package easy;

public class MinStack {
	int[] data;
	int size;
	int min;
	
	public MinStack() {
		data = new int[5];
		size = -1; min = Integer.MAX_VALUE;
	}

	private void doubleSize() {
		int[] temp = data;
		data = new int[2*temp.length];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	public void push(int val) {
		if(size + 1 >= data.length) {
			doubleSize();
		}
		data[++size] = val;
		if(val < min) {
			min = val;
		}
	}

	public void pop() {
		if(size < 0) {
			return;
		}

		if(min == data[size]) {
			int currMin = Integer.MAX_VALUE;
			for(int i=0; i<size; i++) {
				if(data[i] < currMin) {
					currMin = data[i];
				}
			}
			min = currMin;
		}
		size--;
	}

	public int top() {
		if(size < 0) {
			return -1;
		}
		return data[size];
	}

	public int getMin() {
		return min;
	}
}
