package main.java.org.example.Leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;

///https://leetcode.com/problems/reverse-linked-list/description/
public class Cycle {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
//        ListNode listNode3=new ListNode(3);
//        ListNode listNode4=new ListNode(4);
//        ListNode listNode5=new ListNode(5);
//        ListNode listNode6=new ListNode(6);
        listNode1.next=listNode2;
//        listNode2.next=listNode3;
//        listNode3.next=listNode4;
//        listNode4.next=listNode5;
//        listNode5.next=listNode6;
//        listNode6.next=listNode2;
        listNode1.head=listNode1;
//        listNode.addAtEnd(1);
//        listNode.addAtEnd(2);
//        listNode.addAtEnd(3);
//        listNode.addAtEnd(4);
//        listNode.addAtEnd(5);
//        listNode1.display(listNode1.head);
        Cycle solution=new Cycle();
        System.out.println(solution.hasCycle(listNode1.head));
    }
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode node1=head;
        ListNode node2=head;
        while(node2!=null&&node2.next!=null) {
            if(node1==node2.next) {
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;
        }
        return false;
    }
}
