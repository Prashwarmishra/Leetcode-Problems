package easy;

//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
//If the two linked lists have no intersection at all, return null.

public class IntersectionOfTwoLinkedLists {
	
	private int length(ListNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) {
			return null;
		}
		
		int lenA = length(headA);
		int lenB = length(headB);
		
		if(lenA < lenB) {
			ListNode temp = headA;
			headA = headB;
			headB = temp;
		}
		
		int diff = Math.abs(lenA - lenB);
		
		while(diff > 0) {
			headA = headA.next;
			diff--;
		}
		
		while(headA != null && headB != null) {
			if(headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		
		return null;
	}
}
