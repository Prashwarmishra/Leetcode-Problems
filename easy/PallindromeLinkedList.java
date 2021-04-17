package easy;

//Given the head of a singly linked list, return true if it is a palindrome.

public class PallindromeLinkedList {
	
	ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode ans = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return ans;
	}
	
	int length(ListNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		int mid = length(head)/2;
		ListNode temp = head;
		
		while(mid > 1) {
			temp = temp.next;
			mid--;
		}
		
		ListNode head2 = temp.next;
		temp.next = null;
		head2 = reverseList(head2);
		
		while(head != null && head2 != null) {
			if(head.val != head2.val) {
				return false;
			}
			head = head.next;
			head2 = head2.next;
		}
		return true;
	}
}
