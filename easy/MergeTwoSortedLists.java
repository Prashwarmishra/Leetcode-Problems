package easy;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode ans=new ListNode(0);
		ListNode temp = ans;
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				temp.next=new ListNode(l1.val);
				l1=l1.next;
			}else {
				temp.next=new ListNode(l2.val);
				l2=l2.next;
			}
			temp=temp.next;
		}
		while(l1!=null) {
			temp.next=new ListNode(l1.val);
			l1=l1.next;
			temp=temp.next;
		}
		while(l2!=null) {
			temp.next=new ListNode(l2.val);
			l2=l2.next;
			temp=temp.next;
		}
		return ans.next;
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
		ListNode head2 = new ListNode(1);
		head2.next=one;one.next=two;two.next=three;
		
		ListNode ans = mergeTwoLists(head, head2);
		
		while(ans!=null) {
			System.out.print(ans.val+" ");
			ans=ans.next;
		}
		
	}
}
