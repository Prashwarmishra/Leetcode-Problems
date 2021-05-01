package medium;

import java.util.Stack;

//Given an encoded string, return its decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated 
//exactly k times. Note that k is guaranteed to be a positive integer.

public class DecodeString {
	
	public String decodeString(String s) {
		Stack<Character> st = new Stack<>();
		String ans = "";
		
		for(int i=0; i<s.length(); i++) {
			char curr = s.charAt(i);
			if(curr == ']') {
				String str = "";
				while(!st.isEmpty() && st.peek() != '[') {
					str = st.pop() + str;
				}
				st.pop();
				String temp = "";
				while(!st.isEmpty() && st.peek() >= '0' && st.peek() <= '9') {
					temp = st.pop() + temp;
				}
				int num = Integer.parseInt(temp);
				while(num > 0) {
					for(int j=0; j<str.length(); j++) {
						st.add(str.charAt(j));
					}
					num--;
				}
			}else {
				st.add(curr);
			}
		}
		while(!st.isEmpty()) {
			ans = st.pop() + ans;
		}
		return ans;
	}
}
