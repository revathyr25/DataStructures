package main.java.org.example.Leetcode.LinkedList;
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class RemoveNode {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(1);
        listNode.addAtEnd(2);
        ListNode listNode2=new ListNode(3);
        listNode.next=listNode2;
        listNode.addAtEnd(4);
        listNode.addAtEnd(5);
        RemoveNode solution=new RemoveNode();
        solution.removeNode(listNode2);
    }
    public void removeNode(ListNode node) {
        while(node!=null){
            node.val=node.next.val;
            if(node.next.next==null){
                node.next=null;
            }
            node=node.next;
        }
    }
}
