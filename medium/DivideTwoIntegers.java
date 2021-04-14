package medium;

public class DivideTwoIntegers {
	public static int divide(int divid, int divis) {
		long dividend = divid;
		long divisor = divis;
		int sign=1;
		if(dividend<0) {
			sign*=-1;
			dividend*=-1;
		}
		if(divisor<0) {
			sign*=-1;
			divisor*=-1;
		}
		System.out.println("dividend "+dividend+" divisor "+divisor+" sign ");
		if(divisor > dividend) {
			return 0;
		}
		int ans=0;
		while(dividend - divisor >= 0) {
			ans++;
			dividend-=divisor;
		}
		return sign*ans;
	}
	
	public static void main(String[] args) {
		System.out.println(divide(-2147483648, -1));
	}
}
