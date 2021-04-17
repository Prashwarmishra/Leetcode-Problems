package easy;

//Given the head of a singly linked list, reverse the list, and return the reversed list.

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode ans = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return ans;
	}
}
