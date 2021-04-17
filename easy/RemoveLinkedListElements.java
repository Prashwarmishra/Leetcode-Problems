package easy;

//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.
//val == val, and return the new head.

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		
		while(head != null && head.val == val) {
			head = head.next;
		}
		if(head == null) {
			return head;
		}
		
		ListNode prev = head, temp = head.next;
		while(temp != null) {
			if(temp.val == val) {
				prev.next = temp.next;
			}else {
				prev = temp;
			}
			temp = temp.next;
		}
		
		return head;
	}
}
