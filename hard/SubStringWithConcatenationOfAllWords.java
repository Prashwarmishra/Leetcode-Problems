package hard;

import java.util.LinkedList;
import java.util.List;

public class SubStringWithConcatenationOfAllWords {
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> ans = new LinkedList<>();
		List<String> str = new LinkedList<>();
		for(int i=0;i<words.length;i++) {
			String temp=words[i];
			for(int j=0;j<words.length;j++) {
				if(i != j) {
					temp+=words[j];
				}
			}
			str.add(temp);
		}
		for(int i=0;i<str.size();i++) {
			System.out.print(str.get(i)+" ");
		}
		for(int i=0;i<str.size();i++) {
			String temp = str.get(i);
			for(int j=0;j<=s.length()-temp.length();j++) {
				if(s.substring(j, j+temp.length()).equals(temp)) {
					ans.add(j);
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String s = "barfoofoobarthefoobarman";
		String[] words = {"bar","foo","the"};
		List<Integer> ans = findSubstring(s, words);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
