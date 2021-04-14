package medium;

public class RemoveNthNodeFromLL {
	public static ListNode removeN(ListNode head, int n) {
		if(n == 0) {
			return head.next;
		}
		head.next=removeN(head.next, n-1);
		return head;
	}
	public static int length(ListNode head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int len = length(head);
		return removeN(head, len-n);
	}
	public static void main(String[] args) {
		ListNode head = new ListNode();
		head.val = 1;
		ListNode one = new ListNode();
		one.val = 2;
		ListNode two = new ListNode();
		two.val = 3;
		ListNode three = new ListNode();
		three.val=4;
		head.next=one;one.next=two;two.next=three;
		head = removeNthFromEnd(head, 1);
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
