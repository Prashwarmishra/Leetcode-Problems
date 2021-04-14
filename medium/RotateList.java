package medium;

//Given the head of a linked list, rotate the list to the right by k places.

public class RotateList {
	
	private int len(ListNode head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null || head.next == null) {
			return head;
		}
		
		int length = len(head);
		k = length-(k%length)-1;
		if(length-1 == k) {
			return head;
		}
		ListNode temp = head;
		
		while(k > 0) {
			k--;
			temp = temp.next;
		}
		
		ListNode head2 = temp.next;
		temp.next = null;
		temp = head2;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = head;
		return head2;
	}
}
