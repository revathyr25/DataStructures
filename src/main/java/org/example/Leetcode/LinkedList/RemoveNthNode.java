package main.java.org.example.Leetcode.LinkedList;
///https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        listNode.addAtEnd(3);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        int n=5;
        RemoveNthNode solution=new RemoveNthNode();
        ListNode newHead=solution.removeNthFromEnd(listNode.head, n);
        listNode.display(newHead);
    }
    public ListNode removeNthFromEnd(ListNode head,int n) {
        ListNode node1=head;
        ListNode node2=head;
        int count=0;
        while(node2.next!=null){
            if(count>=n){
               node1=node1.next;
            }
            node2=node2.next;
            count++;
        }
        if(n<=count&&null!=node1.next){
            node1.next=node1.next.next;
        }else{
            head=node1.next;
        }
        return head;
    }
}
