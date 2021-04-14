package hard;

class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergekSortedLists {
	
	public static ListNode merge(ListNode list1, ListNode list2) {
		if(list1 == null) {
			return list2;
		}else if(list2 == null) {
			return list1;
		}
		if(list1.val < list2.val) {
			list1.next = merge(list1.next, list2);
			return list1;
		}else {
			list2.next = merge(list1, list2.next);
			return list2;
		}
	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		if(lists.length <= 0) {
			return null;
		}
		ListNode ans = lists[0];
		for(int i=1; i<lists.length; i++) {
			ans = merge(lists[i], ans);
		}
		return ans;
	}
}
