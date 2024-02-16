public class SLList <T>{
    private SLNode head;

    // Empty constructor
    public SLList() {
        head = null;
    }

    // Method to add a Book to the end of the SLList
    public void listAdd(Manga p) {
        SLNode newNode = new SLNode(p);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node and add the new node
            SLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            System.out.println("The list is empty. No book removed.");
            return;
        }

        if (pos == 0) {
            head = head.next;
        } else {
            SLNode current = head;
            for (int i = 0; i < pos - 1 && current.next != null; i++) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Invalid position. No book removed.");
            }
        }
    }

    // Method to represent SLList as a string
    public String toString() {
        StringBuilder result = new StringBuilder();
        SLNode current = head;

        // Traverse the list and append each element to the result string
        while (current != null) {
            result.append(current.data.toString());
            if (current.next != null) {
                result.append("\n\n");
            }
            current = current.next;
        }

        return result.toString();
    }
}