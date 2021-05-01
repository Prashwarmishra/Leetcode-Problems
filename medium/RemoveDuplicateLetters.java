package medium;

import java.util.*;

public class RemoveDuplicateLetters {
	
	public String removeDuplicateLetters(String s) {
		int[] arr = new int[26];
		boolean[] visited = new boolean[26];
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		
		for(int i=0; i<s.length(); i++) {
			char curr = s.charAt(i);
			arr[curr-'a']--;
			if(visited[curr-'a']) {
				continue;
			}
			while(!st.isEmpty() && curr < st.peek() && arr[st.peek()-'a']>0) {
				visited[st.pop()-'a'] = false;
			}
			st.add(curr);
			visited[curr-'a'] = true;
		}
		
		
		StringBuilder ans = new StringBuilder();
		
		while(!st.isEmpty()) {
			ans.insert(0, st.pop());
		}
		
		return ans.toString();
	}
}
