package medium;

//Given the head of a linked list and a value x, partition it such that all nodes less than x come before 
//nodes greater than or equal to x.
//You should preserve the original relative order of the nodes in each of the two partitions.

public class PartitionList {

	public ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode temp = head, pos = null;

		while(temp != null && temp.val < x) {
			pos = temp;
			temp = temp.next;
		}
		if(temp == null) {
			return head;
		}
		ListNode prev = temp; temp = temp.next;
		while(temp != null) {
			if(temp.val < x) {
				if(pos == null) {
					prev.next = temp.next;
					temp.next = head;
					head = pos = temp;
				}else {
					ListNode fwd = pos.next;
					pos.next = temp;
					prev.next = temp.next;
					temp.next = fwd;
					pos = temp;
				}
				temp = prev.next;
			}else {
				prev = temp;
				temp = temp.next;
			}
		}

		return head;
	}		
}
