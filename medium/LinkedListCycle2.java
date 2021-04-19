package medium;

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

public class LinkedListCycle2 {
	
	public ListNode detectCycle(ListNode head) {
		if(head == null) {
			return head;
		}
		
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				while(head != fast) {
					head = head.next;
					fast = fast.next;
				}
				return head;
			}
		}
		
		return null;
	}
}
