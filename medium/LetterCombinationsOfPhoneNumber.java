package medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
	static String[] letterString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> letterCombinations(String digits) {
		List<String> ans = new LinkedList<>();
		if(digits.length() == 0) {
			return ans;
		}
		fill(ans, digits, 0, "");
		return ans;
	}
	
	public static void fill(List<String> ans, String digits, int index, String str) {
		if(index >= digits.length()) {
			ans.add(str);
			return;
		}
		String curr = letterString[digits.charAt(index)-'0'];
		for(int i=0;i<curr.length();i++) {
			fill(ans, digits, index+1, str+curr.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		List<String> ans = letterCombinations("23");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
