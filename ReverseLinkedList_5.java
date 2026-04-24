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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode later = curr.next;
            curr.next = prev;
            prev = curr;
            curr = later;
        }
        return prev;
    }
}

public class ReverseLinkedList_5 {
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        ListNode reversedHead = sol.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}