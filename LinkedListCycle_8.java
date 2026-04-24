class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle_8 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle_8 sol = new LinkedListCycle_8();

        // Case 1: No cycle
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        System.out.println("Cycle present (List 1)? " + sol.hasCycle(head1));

        // Case 2: With cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        // Creating cycle: 4 -> 2
        head2.next.next.next.next = head2.next;

        System.out.println("Cycle present (List 2)? " + sol.hasCycle(head2));
    }
}