package main.java.org.example.Leetcode.LinkedList;
///https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(3);
        listNode.addAtEnd(3);
        listNode.addAtEnd(3);
        listNode.addAtEnd(4);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        RemoveDuplicates solution=new RemoveDuplicates();
        ListNode newHead=solution.removeDuplicates(listNode.head);
        listNode.display(newHead);
    }
    public ListNode removeDuplicates(ListNode head) {
        if(null!=head){
            ListNode node1=head;
            ListNode node2=head;
            int headValue=head.val;
            int tempValue=head.val;
            node2=(null!=node2.next)?node2.next:node2;
            while(node2.next!=null){
                if((node1.val!=node2.val&&tempValue!= node2.val)&&node2.val!=node2.next.val){
                    if(head.val==node1.val&&head.next!=node2){
                        head=node2;
                        node1=head;
                    }else{
                        node1.next= node2;
                        node1=node1.next;
                    }
                    node2=node2.next;
                }else{
                    tempValue=node2.val;
                    node2=node2.next;
                }
            }
            if(node1.val!=node2.val&&tempValue!= node2.val){
                if(node1.val==headValue){
                    node1= node2;
                    head=node1;
                }else {
                    node1.next= node2;
                }
            }
            if(node1.val==headValue){
                head=null;
            }
        }
        return head;
    }
}
