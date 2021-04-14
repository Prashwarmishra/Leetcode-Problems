package medium;

public class StringToInteger {
	public static int myAtoi(String s) {
		long ans=0;
		boolean isNegative=false;
		boolean sign=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				if(sign) {
					break;
				}
				continue;
			}else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
				if(sign) {
					break;
				}
				if(s.charAt(i) == '-') {
					isNegative=true;
				}
				sign=true;
			}else {
				int temp=s.charAt(i)-'0';
				if(temp<0 || temp>9) {
					break;
				}
				ans=ans*10+temp;
				if(ans>Integer.MAX_VALUE) {
					if(isNegative) {
						return Integer.MIN_VALUE;
					}
					return Integer.MAX_VALUE;
				}
				sign=true;
			}
		}
		if(isNegative) {
			return (int)(-1*ans);
		}
		return (int)ans;
	}
	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
}
