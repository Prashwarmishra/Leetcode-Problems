package hard;

import java.util.Stack;

//Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
//return the area of the largest rectangle in the histogram.

public class LargestRectangleInHistogram {

	public int largestRectangleArea(int[] heights) {
		int max = 0;
		Stack<Integer> st = new Stack<>();
		int i=0;
		for(; i<heights.length; i++) {
			while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
				int curr = st.pop();
				int temp;
				if(st.isEmpty()) {
					temp = heights[curr]*(i);
				}else {
					temp = heights[curr]*(i-st.peek()-1);
				}
				if(temp > max) {
					max = temp;
				}
			}
			st.add(i);
		}
		
		while(!st.isEmpty()) {
			int curr = st.pop();
			int temp;
			if(st.isEmpty()) {
				temp = heights[curr]*(i);
			}else {
				temp = heights[curr]*(i-st.peek()-1);
			}
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}
}
