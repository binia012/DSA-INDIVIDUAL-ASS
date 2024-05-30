package linkedlist;

public class StackUsingLinkedList {
    Node head;

    public StackUsingLinkedList() {
        this.head = null;
    }

    void push(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void pop() {
        if (head != null) {
            Node current = head;
            head = head.next;
            current.next = null;
        }
    }

    void peek() {
        if (head != null) {
            System.out.println("Top element is: " + head.data);
        }
    }
}

