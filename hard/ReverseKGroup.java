package hard;

//Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
//
//k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is 
//not a multiple of k then left-out nodes, in the end, should remain as it is.

class Pair{
	ListNode head;
	ListNode tail;
	Pair(ListNode head, ListNode tail){
		this.head = head;
		this.tail = tail;
	}
}

public class ReverseKGroup {
	private Pair reverse(ListNode head) {
		if(head == null || head.next == null) {
			return new Pair(head, head);
		}
		Pair ans = reverse(head.next);
		ans.tail.next = head;
		head.next = null;
		return new Pair(ans.head, head);
	}
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head == null) {
			return head;
		}
		int count = 1;
		ListNode temp = head;
		while(temp != null && count < k) {
			count++;
			temp = temp.next;
		}
		if(temp == null) {
			return head;
		}
		ListNode head2 = temp.next;
		temp.next = null;
		Pair ans = reverse(head);
		ans.tail.next = reverseKGroup(head2, k);
		return ans.head;
	}
}
