package easy;

public class IntegerToRoman {
	public static int romanToInt(String s) {
		int ans=0;
		int curr=0, prev=0;
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			if(temp == 'I') {
				curr = 1;
			}else if(temp == 'V') {
				curr = 5;
			}else if(temp == 'X') {
				curr = 10;
			}else if(temp == 'L') {
				curr = 50;
			}else if(temp == 'C') {
				curr = 100;
			}else if(temp == 'D') {
				curr = 500;
			}else {
				curr = 1000;
			}
			if(curr>prev) {
				ans=ans+curr-(2*prev);
			}else {
				ans+=curr;
			}
			prev=curr;
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
}
