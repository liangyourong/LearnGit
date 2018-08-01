package helloworld;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Hello {
	
	public static boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
	}
	
	public static ListNode detectCycle(ListNode head) {
		if (head == null) {
			return head;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				break;
			}
		}
		
		if(fast == null || fast.next == null) {
			return null;
		}
		
		fast =head;
		while(fast!=slow) {
			fast =fast.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
