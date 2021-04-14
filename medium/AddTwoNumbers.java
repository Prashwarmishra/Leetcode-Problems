package medium;


// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans=new ListNode();
		ListNode head=ans;
		int carry=0, sum=0;
		sum=l1.val+l2.val;
		ans.val=sum%10;
		carry=sum/10;
		l1=l1.next;
		l2=l2.next;
		while(l1 != null && l2 != null) {
			ListNode temp=new ListNode();
			sum=l1.val+l2.val+carry;
			temp.val=sum%10;
			carry=sum/10;
			ans.next=temp;
			ans=ans.next;
			l1=l1.next;
			l2=l2.next;
		}
		while(l1 != null) {
			sum=carry+l1.val;
			ListNode temp=new ListNode();
			temp.val=sum%10;
			carry=sum/10;
			ans.next=temp;
			ans=ans.next;
			l1=l1.next;
		}
		while(l2 != null) {
			sum=carry+l2.val;
			ListNode temp=new ListNode();
			temp.val=sum%10;
			carry=sum/10;
			ans.next=temp;
			ans=ans.next;
			l2=l2.next;
		}
		if(carry>0) {
			ListNode temp=new ListNode();
			temp.val=carry;
			ans.next=temp;
		}
		return head;
	}
}
