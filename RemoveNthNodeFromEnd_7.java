class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // If deleting the head
        if (fast == null) return head.next;

        // Move both pointers
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete node
        slow.next = slow.next.next;

        return head;
    }
}

public class RemoveNthNodeFromEnd_7 {
    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();

        int n = 2; // remove 2nd node from end (node 4)
        head = sol.removeNthFromEnd(head, n);

        System.out.println("After Removing " + n + "th Node From End:");
        printList(head);
    }

    // Helper function
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}