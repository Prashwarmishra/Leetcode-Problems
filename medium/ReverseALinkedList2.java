package medium;

//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes 
//of the list from position left to position right, and return the reversed list.

class Pair{
	ListNode head;
	ListNode tail;
	Pair(ListNode head, ListNode tail){
		this.head = head;
		this.tail = tail;
	}
}

public class ReverseALinkedList2 {
	
	private Pair reverse(ListNode head, int count, int n) {
		if(head == null || head.next == null || count == n) {
			return new Pair(head, head);
		}
		Pair ans = reverse(head.next, count+1, n);
		ans.tail.next = head;
		head.next = null;
		return new Pair(ans.head, head);
	}
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(left == right) {
			return head;
		}
		
		ListNode ansHead = null, ansTail = null, temp = head;
		int count = 1, headCount = 1;
		if(left != 1) {
			while(temp.next != null && count < left-1) {
				temp = temp.next;
				count++;
			}
			if(temp.next == null) {
				return head;
			}
			ansHead = temp;
			headCount = count+1;
		}
		while(temp != null && count < right) {
			temp = temp.next;
			count++;
		}
		ansTail = temp.next;
		if(ansHead == null) {
			Pair ans = reverse(head, headCount, right);
			ans.tail.next = ansTail;
			return ans.head;
		}else {
			Pair ans = reverse(ansHead.next, headCount, right);
			ansHead.next = ans.head;
			ans.tail.next = ansTail;
			return head;
		}
	}
}
