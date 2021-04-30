package hard;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water 
//it can trap after raining.

public class TrappingRainWater {
	
	public int trap(int[] height) {
		int n = height.length;
		
		if(n < 3) {
			return 0;
		}
		
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int i=0; i< n; i++) {
			if(height[i] > max) {
				max = height[i];
				maxIndex = i;
			}
		}
		int ans = 0;
		int currMax = height[0];
		for(int i=1; i<maxIndex; i++) {
			if(height[i] >= currMax) {
				currMax = height[i];
			}else {
				ans+=currMax-height[i];
			}
		}
		currMax = height[n-1];
		for(int i=n-2; i>maxIndex; i--) {
			if(height[i] >= currMax) {
				currMax = height[i];
			}else {
				ans+=currMax-height[i];
			}
		}
		return ans;
	}
}
