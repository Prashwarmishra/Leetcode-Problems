package easy;

public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
		int maxSum=nums[0];
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=i;j<nums.length;j++) {
				sum+=nums[j];
				if(sum>maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
}
