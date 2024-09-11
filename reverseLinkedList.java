class ListNode {
    int value;
    ListNode next;

    // Constructor to create a new node
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Function to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // Store the next node
            next = current.next;
            // Reverse the current node's pointer
            current.next = prev;
            // Move the pointers one step forward
            prev = current;
            current = next;
        }

        // prev will be the new head after the loop
        return prev;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}
