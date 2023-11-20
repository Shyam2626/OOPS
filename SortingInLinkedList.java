public class SortingInLinkedList {

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

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Display(){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.println();
    }

    public void Sort(){

        Node curr=head,index=null;
        int temp;

        while(curr!=null){
            index=curr.next;
            while(index!=null){
                if(curr.data>index.data){
                    temp=curr.data;
                    curr.data=index.data;
                    index.data=temp;
                }
                index=index.next;
            }
            curr=curr.next;
        }
 
    }

    public static void main(String args[]) {

        SortingInLinkedList sortingInLinkedList=new SortingInLinkedList();
        sortingInLinkedList.addElement(54);
        sortingInLinkedList.addElement(21);
        sortingInLinkedList.addElement(2);
        sortingInLinkedList.addElement(34);
        sortingInLinkedList.addElement(100);
        sortingInLinkedList.Display();
        sortingInLinkedList.Sort();
        sortingInLinkedList.Display();

    }
    
}
