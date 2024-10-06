package main.java.org.example.Leetcode.LinkedList;
///https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        listNode.addAtEnd(3);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        ReverseList solution=new ReverseList();
        ListNode newHead=solution.reverseList(listNode.head);
        listNode.display(newHead);
    }
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        if(head!=null){
            ListNode node2=head.next;
            ListNode temp=head;
            while(node2!=null){
                node=node2;
                node2=node2.next;
                node.next=temp;
                temp=node;

            }
            head.next=null;
            head=node;
        }
        return head;
    }
}
