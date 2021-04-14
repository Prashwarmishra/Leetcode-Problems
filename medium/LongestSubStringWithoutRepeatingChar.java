package medium;

import java.util.Scanner;

public class LongestSubStringWithoutRepeatingChar {
//	public static int lengthOfLongestSubstring(String s) {
//		if(s.equals("")) {
//			return 0;
//		}
//		int[] arr = new int[256];
//		int ans = 1;
//		for(int i=0; i<s.length(); i++) {
//			int count=0;
//			for(int j=i;j<s.length();j++) {
//				char temp = s.charAt(j);
//				if(arr[temp]>0) {
//					arr=new int[256];
//					break;
//				}else {
//					arr[temp]++;
//					count++;
//				}
//			}
//			if(count>ans) {
//				ans = count;
//			}
//		}
//		return ans;
//	}
	
	public static int lengthOfLongestSubstring(String s) {
        int res=0,i=0;
        int arr[]=new int[128];
        for(int j=0;j<s.length();j++){
            arr[s.charAt(j)]++;
            while(arr[s.charAt(j)]>1) {
                arr[s.charAt(i++)]--;
            }
            res=Math.max(j-i+1,res);
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		String s = st.next();
		st.close();
		System.out.println(lengthOfLongestSubstring(s));
	}
}
