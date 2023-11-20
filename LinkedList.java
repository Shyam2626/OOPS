public class LinkedList {
    Node head;
    Node tail;
    int size=0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
             size++;
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void RemoveFirst(){
        if(size==0){
            System.out.print("LL is Empty");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }

    public void RemoveLast(){

        if(size==0){
            System.out.print("LL is Empty");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }

    public void AddMiddle(int idx,int data){
        Node newNode= new Node(data),temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode=temp.next;
        temp.next=newNode;
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
        ll.RemoveFirst();
        ll.printLinkedList();
        ll.RemoveLast();
        ll.printLinkedList();
        ll.RemoveLast();
        ll.printLinkedList();
        ll.RemoveFirst();
        ll.printLinkedList();
        ll.RemoveFirst();
        ll.RemoveFirst();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.printLinkedList();

    }
}
