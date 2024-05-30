package linkedlist;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    void insertatstart(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertatend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }
        newnode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
    }

    void deleteatstart() {
        if (head != null) {
            Node current = head;
            head = head.next;
            current.next = null;
        }
    }

    void deleteatend() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }


    public void insert(int data) {

        Node node = new Node(data);


        if (head == null) {
            head = node;
        }
        node.next = null;

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void display() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void insertAfter(Node prevnode, int data) {
        if (prevnode != null) {
            Node newnode = new Node(data);

            if (prevnode.next == null) {
                newnode.next = null;
                prevnode.next = newnode;
            } else {
                newnode.next = prevnode.next;
                prevnode.next = newnode;
            }
        }
    }

    public void insertatpos(int pos, int data) {
        Node newnode = new Node(data);
        if (pos == 0) {
            newnode.next = head;
            head = newnode;
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }

    }

    public void deleteatpos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (pos == 0) {
            Node current = head;
            head = head.next;
            current.next = null;
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = temp.next;
            temp.next = null;
        }
    }

    public void deleteafternode(Node prevnode) {
        if (prevnode == null) {
            System.out.println("Previous node cannot be null");
        } else {
            Node current = prevnode.next;
            prevnode.next = current.next;
            current.next = null;
        }
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Element found at position " + i);
                return;
            }
            current = current.next;
            i++;
        }
        System.out.println("Element not found");
    }
}


