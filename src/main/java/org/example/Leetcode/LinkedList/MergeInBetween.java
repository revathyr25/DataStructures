package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/merge-in-between-linked-lists/description/
public class MergeInBetween {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        listNode.addAtEnd(3);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        ListNode listNode2=new ListNode();
        listNode2.addAtEnd(1);
        listNode2.addAtEnd(2);
        listNode2.addAtEnd(3);
        listNode2.addAtEnd(4);
        listNode2.addAtEnd(5);
        MergeInBetween solution=new MergeInBetween();
        solution.mergeInBetween(listNode,2,4,listNode2);
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode node1=list1;
        ListNode node2=list2;
        ListNode head2=list2;
        ListNode temp=list1;

        while(count<b||node2.next!=null){
            if(count==a-1){
            temp=node1;
            }
            if(count<b){
                node1=node1.next;
                count++;
            }
            if(node2.next!=null){
                node2=node2.next;
            }
        }
        temp.next=head2;
        node2.next=node1.next;
        return list1;
    }
//    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//        int count=0;
//        ListNode node1=list1;
//        ListNode node2=list2;
//        ListNode temp=list1;
//
//        while(count<b){
//            if(count==a-1){
//            temp=node1;
//            }
//            node1=node1.next;
//            count++;
//        }
//        temp.next=node2;
//        while(node2.next!=null){
//            node2=node2.next;
//        }
//        node2.next=node1.next;
//        return list1;
//    }
}
