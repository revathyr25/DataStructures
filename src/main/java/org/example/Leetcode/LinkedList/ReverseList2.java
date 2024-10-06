package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/reverse-linked-list-ii/description/
public class ReverseList2 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
//        listNode.addAtEnd(3);
//        listNode.addAtEnd(4);
//        listNode.addAtEnd(5);
        ReverseList2 solution=new ReverseList2();
        ListNode newHead=solution.reverseList2(listNode.head,1,2);
        listNode.display(newHead);
    }
    public ListNode reverseList2(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode node=head;
        ListNode prevNode=null;
        int count=1;
        while(count<left){
            prevNode=node;
            node=node.next;
            count++;
        }
        int number=right-left;
        ListNode nodeFinal=reverseList(node,number);
        if(prevNode==null){
            return nodeFinal;
        }else{
            prevNode.next=nodeFinal;
        }
        return head;
    }
    public ListNode reverseList(ListNode head,int number) {
        ListNode node=head;
        if(head!=null){
            ListNode node2=head.next;
            ListNode temp=head;
            int count=0;
            while(count<number){
                node=node2;
                node2=node2.next;
                node.next=temp;
                temp=node;
                count++;

            }
            head.next=node2;
            head=node;
        }
        return head;
    }
}
