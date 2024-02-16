public class DLNode <T>{
    Manga data;
    DLNode prev;
    DLNode next;

    // Constructor
    public DLNode(Manga data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}