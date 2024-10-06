package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/remove-linked-list-elements/description/
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        listNode.addAtEnd(7);
        RemoveLinkedListElements solution=new RemoveLinkedListElements();
        solution.removeElements(listNode.head,7);
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode node1=head;
        ListNode temp=head;

        while(node1!=null&&node1.next!=null){
            if(node1.next.val==val){
                temp=node1;
                while(node1.next!=null&&node1.next.val==val){
                    node1=node1.next;
                }
                node1=node1.next;
                temp.next=node1;
            }else{
                node1=node1.next;
            }
        }
        if(head!=null&&head.val==val){
            head=head.next;
        }
        return head;
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
