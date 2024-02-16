public class DLList <T>{
    private DLNode head;

    // Empty constructor
    public DLList() {
        head = null;
    }

    // Method to add a Book to the end of the DLList
    public void listAdd(Manga p) {
        DLNode newNode = new DLNode(p);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node and add the new node
            DLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to remove a Book at a specified position in the DLList
    public void listRemove(int pos) {
        if (head == null) {
            System.out.println("The list is empty. No book removed.");
            return;
        }

        DLNode current = head;

        // Traverse to the specified position
        for (int i = 0; i < pos && current != null; i++) {
            current = current.next;
        }

        // If the specified position is within the list, update pointers to remove the node
        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                // If removing the head, update the head to the next node
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }
        } else {
            System.out.println("Invalid position. No book removed.");
        }
    }

    // Method to represent DLList as a string

}
