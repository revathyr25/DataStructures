package main.java.org.example.Leetcode.LinkedList;


import java.util.Stack;

public class AddTowNumbers2 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addAtEnd(7);
        ListNode listNode2=new ListNode();
        listNode2.addAtEnd(5);
        AddTowNumbers2 solution=new AddTowNumbers2();
        solution.addNumbers(listNode.head,listNode2.head);
    }
    public ListNode addNumbers(ListNode l1, ListNode l2) {
//        ListNode finalResult=new ListNode();
        Stack<ListNode> stack1=new Stack<>();
        Stack<ListNode> stack2=new Stack<>();
        ListNode node1=l1;
        ListNode node2=l2;
        int n1=0;
        int n2=0;
        int bal=0;
        while(node1!=null){
            stack1.push(node1);
            node1=node1.next;
        }while(node2!=null){
            stack2.push(node2);
            node2=node2.next;
        }

        ListNode nextNode=null;
        while(!stack1.isEmpty()||!stack2.isEmpty()){
            ListNode result=new ListNode();
            if(!stack1.isEmpty()){
                node1=stack1.pop();
                n1=node1.val;
            }if(!stack2.isEmpty()){
                node2=stack2.pop();
                n2=node2.val;
            }
            if(n1+n2+bal>9){
                result.val=n1+n2+bal-10;
                bal=1;
            }else{
                result.val=n1+n2+bal;
                bal=0;
            }
            result.next=nextNode;
            nextNode=result;
            n1=0;
            n2=0;
        }
        if(bal!=0){
            ListNode result=new ListNode();
            result.val=bal;
            result.next=nextNode;
            nextNode=result;
        }
        return nextNode;
    }
}
