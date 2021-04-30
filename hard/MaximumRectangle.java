package hard;

import java.util.Stack;

//Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

public class MaximumRectangle {

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
	
	public int maximalRectangle(char[][] matrix) {
		if(matrix.length <= 0) {
			return 0;
		}
		int[] arr = new int[matrix[0].length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = matrix[0][i]-48;
		}
		int max = largestRectangleArea(arr);
		
		int[] arr2 = arr;
		for(int i=1; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] == '1') {
					arr2[j] = arr[j]+1;  
				}else {
					arr2[j] = 0;
				}
			}
			int temp = largestRectangleArea(arr2);
			if(temp > max) {
				max = temp;
			}
			arr = arr2;
		}
		
		return max;
	}
//	public static void main(String[] args) {
//		char[][] matrix = {{'1','1','1','0','1'}};
//		System.out.println(maximumRectangle(matrix));
//	}
}
