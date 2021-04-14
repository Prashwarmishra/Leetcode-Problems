package medium;

public class LongestPallindromicSubString {
	
	public static String longestPalindrome(String s) {
		String max="";
		for(int i=0;i<s.length();i++) {
			for(int p=i, q=i; p>=0 && q<s.length() && s.charAt(p) == s.charAt(q); p--,q++) {
				if(q-p+1>max.length()) {
					max=s.substring(p, q+1);
				}
			}
			for(int p=i, q=i+1; p>=0 && q<s.length() && s.charAt(p) == s.charAt(q); p--,q++) {
				if(q-p+1>max.length()) {
					max=s.substring(p, q+1);
				}
			}	
		}
		return max;
    }
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaaa"));
	}
}
