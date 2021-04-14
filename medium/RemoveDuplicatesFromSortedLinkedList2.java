package medium;

//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers 
//from the original list. Return the linked list sorted as well.

public class RemoveDuplicatesFromSortedLinkedList2 {

	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}

		ListNode prev = null, temp = head;

		while(temp != null) {
			if(temp.next != null && temp.val == temp.next.val) {
				while(temp.next != null && temp.val == temp.next.val) {
					temp = temp.next;
				}
				if(prev == null) {
					temp = temp.next;
					head = temp;
				}else {
					temp = temp.next;
					prev.next = temp;
				}
			}else {
				prev = temp;
				temp = temp.next;
			}
		}

		return head;
	}
}
