class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next; 
    }
}

public class DeleteNode_6 {
    public static void main(String[] args) {
        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original List:");
        printList(head);

        // Suppose we want to delete node with value 5
        ListNode nodeToDelete = head.next; // node with value 5

        Solution sol = new Solution();
        sol.deleteNode(nodeToDelete);

        System.out.println("After Deletion:");
        printList(head);
    }

    // Helper method to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}