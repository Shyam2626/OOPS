public class StackUsingLinkedList {

    Node head = null;
    Node tail;

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String args[]) {
        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.Push(90);
        sll.pop();
        sll.Push(67);
        sll.Push(57);
        sll.Display();
    }
}
