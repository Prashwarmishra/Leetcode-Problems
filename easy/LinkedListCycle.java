package easy;

//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously 
//following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is 
//connected to. Note that pos is not passed as a parameter.

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head) {
		if(head == null){
            return false;
        }
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
}
