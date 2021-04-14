package easy;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] str) {
		if(str.length <= 0) {
			return "";
		}
		String ans="";
		int n=Integer.MAX_VALUE;
		for(int i=0;i<str.length;i++) {
			n = Math.min(n, str[i].length());
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<str.length-1;j++) {
				if(str[j].charAt(i) != str[j+1].charAt(i)) {
					return ans;
				}
			}
			ans+=str[0].charAt(i);
		}	
		return ans;	
	}
	public static void main(String[] args) {
		String[] str = {};
		System.out.println(longestCommonPrefix(str));
	}
}
