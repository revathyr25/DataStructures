package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        listNode.addAtEnd(3);
//        listNode.addAtEnd(3);
//        listNode.addAtEnd(3);
//        listNode.addAtEnd(4);
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        SwapNodesInPairs solution=new SwapNodesInPairs();
        ListNode newHead=solution.swapPairs(listNode.head);
        listNode.display(newHead);
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        if(null!=head) {
            ListNode node1 = head;
            ListNode node2 = head;
            ListNode temp = head;
            node2 = (null != node2.next) ? node2.next : node2;
            while (node2 != null&&node2!=head ) {
                temp.next=node2;
                temp = node1;
                node1 = node2;
                if(temp==head){
                    head=node1;
                }
                temp.next=node1.next;
                node1.next=temp;
                node1=temp.next;
                node2 = (null != node1) ? node1.next : node1;
            }
        }
        return head;
    }
//    public ListNode swapPairs(ListNode head) {
//        if(null!=head) {
//            ListNode node1 = head;
//            ListNode node2 = head;
//            ListNode temp = head;
//            node2 = (null != node2.next) ? node2.next : node2;
//            while (node2 != null&&node2!=head ) {
//                temp.next=node2;
//                temp = node1;
//                node1 = node2;
//                if(temp==head){
//                    head=node1;
//                }
//                temp.next=node1.next;
//                node1.next=temp;
//                node1=temp.next;
//                node2 = (null != node1) ? node1.next : node1;
//            }
//        }
//        return head;
//    }
}
