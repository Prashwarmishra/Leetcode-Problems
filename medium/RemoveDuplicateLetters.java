package medium;

public class RemoveDuplicateLetters {
	
	public String removeDuplicateLetters(String s) {
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++) {
			int curr = s.charAt(i)-97;
			if(arr[curr] == 0) {
				arr[curr] = 1;
			}
		}
		String ans = "";
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				ans+=(char)(i+97);
			}
		}
		return ans;
	}
}
