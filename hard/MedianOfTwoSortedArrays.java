package hard;

public class MedianOfTwoSortedArrays {
	public int[] merge(int[] arr1, int[] arr2) {
		int m=arr1.length, n=arr2.length;
		int[] arr=new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			}else {
				arr[k++]=arr2[j++];
			}
		}
		while(i<m) {
			arr[k++]=arr1[i++];
		}
		while(j<n) {
			arr[k++]=arr2[j++];
		}
		return arr;
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int[] arr = merge(nums1, nums2);
		int n=arr.length;
		if(n%2 == 0) {
			return (arr[n/2]+arr[(n/2)-1])/2.0;
		}else {
			return arr[n/2];
		}	
	}
}
