public class LinkedList {
    class Node{
        int data;
        LinkedList.Node next;
        Node(int data){
            this.data=data;
        }
    }

    public LinkedList.Node head = null;
    public LinkedList.Node tail = null;

    public void addNode(int data){
        LinkedList.Node newNode=new LinkedList.Node(data);
        if (head==null){
            head=newNode;
        }else {
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void display(){
        if (head==null){
            System.out.println("no data");
        }else {
            LinkedList.Node current=head;
            while (current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public void LinkedListAdd() {
        LinkedList list=new LinkedList();
        list.addNode(2);
        list.addNode(3);
        list.addNode(6);
        list.display();
    }
}
