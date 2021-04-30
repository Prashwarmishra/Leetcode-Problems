package easy;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

public class ValidParenthesis {
	
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char curr = s.charAt(i);
			if(curr == '(' || curr == '{' || curr == '[') {
				st.add(curr);
			}else {
				if(curr == ')') {
					if(!st.isEmpty() && st.peek() == '(') {
						st.pop();
					}else {
						return false;
					}
				}
				else if(curr == '}') {
					if(!st.isEmpty() && st.peek() == '{') {
						st.pop();
					}else {
						return false;
					}
				}
				else if(curr == ']') {
					if(!st.isEmpty() && st.peek() == '[') {
						st.pop();
					}else {
						return false;
					}
				}
			}
		}
		if(!st.isEmpty()) {
			return false;
		}
		return true;
	}
}
