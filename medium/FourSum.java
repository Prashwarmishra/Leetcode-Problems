package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
	//[-2,-2,-1,0,0,1,2]
	public List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>> ans = new LinkedList<>();
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<n-3;i++) {
			if(i>0 && arr[i] == arr[i-1]) {
				continue;
			}
			for(int j=i+1;j<n-2;j++) {
				if(j>i+1 && arr[j] == arr[j-1]) {
					continue;
				}
				int s=j+1,e=n-1;
				while(s<e) {
					int curr = arr[i]+arr[j]+arr[s]+arr[e];
					if(curr>target) {
						e--;
					}else if(curr<target) {
						s++;
					}else {
						List<Integer> temp=new LinkedList<>();
						temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[s]);temp.add(arr[e]);
						ans.add(temp);
						while(s<e && arr[s] == arr[s+1]) {
							s++;
						}
						while(s<e && arr[e] == arr[e-1]) {
							e--;
						}
						s++;e--;
					}
				}
			}
		}
		return ans;
	}
}
