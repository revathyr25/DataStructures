package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/merge-in-between-linked-lists/description/
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        listNode.addAtEnd(3);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        MiddleOfLinkedList solution=new MiddleOfLinkedList();
        solution.middleNode(listNode);
    }
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode node=head;
        while(node!=null){
            node=node.next;
            count++;
        }
        int mid=(count/2) +1;
        ListNode node1=head;
        int count1=1;
        while(count1<mid){
            node1=node1.next;
            count1++;
        }
        return node1;
    }
}
