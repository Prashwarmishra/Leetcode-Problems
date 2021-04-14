package medium;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		int ans = 0;
		int maxDiff = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			int s=i+1, e=nums.length-1;
			while(s<e) {
				int currSum = nums[i]+nums[s]+nums[e];
				if(currSum>target) {
					e--;
				}else {
					s++;
				}
				int currDiff = Math.abs(currSum-target);
				if(currDiff<maxDiff) {
					maxDiff=currDiff;
					ans=currSum;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,0};
		System.out.println(threeSumClosest(nums, -100));
	}
}
