package easy;

public class ReverseInteger {
	public static int reverse(int x) {
		long ans=0;
		int sign = 1;
		if(x<0) {
			sign = -1;
			x=-x;
		}
		while(x>0) {
			ans=ans*10+x%10;
			if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) {
				return 0;
			}
			x/=10;
		}
		return sign*(int)ans;
	}
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
