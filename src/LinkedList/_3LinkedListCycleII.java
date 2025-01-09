package LinkedList;

public class _3LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return null;
        while(slow!=temp) {
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {

    }
}
