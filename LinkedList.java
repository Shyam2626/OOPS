public class LinkedList {
    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        // step 1: create new node with data
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2: assign new node.next with head
        newNode.next = head;
        // step 3: head = new node
        head = newNode;
    }

    public void addLast(int data) {
        // step 1: create new node with data
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2: assign tail.next to newNode
        tail.next = newNode;
        // step 3: assign newNode to tail
        tail = newNode;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Delete(){
        if(head==null){
            System.out.print("LinkedList is Empty");
            return;
        }
        head=head.next;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.printLinkedList();
        ll.addLast(7);
        ll.addLast(1);
        ll.printLinkedList();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.printLinkedList();
        ll.Delete();
        ll.printLinkedList();
    }
}
