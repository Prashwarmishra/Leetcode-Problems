package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> ans = new LinkedList<>();
		for(int i=0;i<arr.length-2;i++) {
			if(i>0 && arr[i] == arr[i-1]) {
				continue;
			}
			int s=i+1, e=arr.length-1;
			while(s<e) {
				int curr = arr[i]+arr[s]+arr[e];
				if(curr>0) {
					e--;
				}else if(curr<0) {
					s++;
				}else {
					List<Integer> temp = new LinkedList<>();
					temp.add(arr[i]);temp.add(arr[s]);temp.add(arr[e]);
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
		return ans;
	}
}
