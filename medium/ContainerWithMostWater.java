package medium;

public class ContainerWithMostWater {
	public int maxArea(int[] arr) {
		int max=0;
		for(int i=0,j=arr.length-1;i<j;) {
			max=Math.max(max, Math.min(arr[i], arr[j])*(j-i));
			if(arr[i]<arr[j]) {
				i++;
			}else{
				j--;
			}
		}
		return max;
	}
}
