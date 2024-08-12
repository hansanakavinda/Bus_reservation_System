// Java program for Linked list implementation of Stack
// A linked list (LL) node to store a Stack entry
public class SNode {
    String[] data;
    SNode next;

    // constructor to create a new linked list node
    public SNode(String[] data) {
        this.data = data;
        this.next = null;
    }
}
