package medium;

//A linked list of length n is given such that each node contains an additional random pointer, which could point 
//to any node in the list, or null.

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
	public Node copyRandomList(Node head) {
		if(head == null) {
			return head;
		}
		Node newHead, newTail;
		newHead = newTail = new Node(head.val);
		Node temp1 = head.next;
		while(temp1 != null) {
			newTail.next = new Node(temp1.val);
			temp1 = temp1.next;
			newTail = newTail.next;
		}
		
		temp1 = head; newTail = newHead;
		while(temp1 != null) {
			if(temp1.random != null) {
				Node temp = head, temp2 = newHead;
				while(temp != temp1.random) {
					temp = temp.next;
					temp2 = temp2.next;
				}
				newTail.random = temp2;
			}
			temp1 = temp1.next;
			newTail = newTail.next;
		}
		
		return newHead;
	}
}
