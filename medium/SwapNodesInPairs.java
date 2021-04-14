package medium;

//Given a linked list, swap every two adjacent nodes and return its head.

public class SwapNodesInPairs {
	
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = head.next;
		head.next = temp.next;
		temp.next = head;
		head = temp;
		
		ListNode prev = temp.next, fwd = null;
		temp = head.next.next;
		while(temp != null && temp.next != null) {
			fwd = temp.next;
			prev.next = fwd;
			temp.next = fwd.next;
			fwd.next = temp;
			
			prev = temp;
			temp = temp.next;
		}
		
		return head;
	}
	
}
