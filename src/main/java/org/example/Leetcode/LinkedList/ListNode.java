package main.java.org.example.Leetcode.LinkedList;

public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    //Represent the head and tail of the singly linked list
    public ListNode head = null;
    public ListNode tail = null;
    public void addAtStart(int data) {
        //Create a new node
        ListNode newNode = new ListNode(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //Node temp will point to head
            ListNode temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
        }
    }
    public void addAtEnd(int data) {
        //Create a new node
        ListNode newNode = new ListNode(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        ListNode current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes to the start of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void display(ListNode head) {
        //Node current will point to head
        ListNode current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes to the start of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
