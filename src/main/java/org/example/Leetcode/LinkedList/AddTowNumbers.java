package main.java.org.example.Leetcode.LinkedList;

import java.util.List;

public class AddTowNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNumbers(l1,l2,0);
    }
    public ListNode addNumbers(ListNode l1, ListNode l2,int bal) {
        ListNode finalValue=new ListNode();
        if(l1==null&&l2==null){
            if(bal!=0){
                finalValue.val=bal;
            }else{
                finalValue=null;
            }
            return finalValue;
        }else if(l1==null){
            if(bal+ l2.val>9){
                finalValue.val=bal+ l2.val-10;
                bal=1;
            }else {
                finalValue.val=bal+ l2.val;
                bal=0;
            }
            finalValue.next=addNumbers(l1,l2.next,bal);
        }else if(l2==null){
            if(bal+ l1.val>9){
                finalValue.val=bal+ l1.val-10;
                bal=1;
            }else {
                finalValue.val=bal+ l1.val;
                bal=0;
            }
            finalValue.next=addNumbers(l1.next,l2,bal);
        }else{
            if(bal+l1.val+ l2.val>9){
                finalValue.val=bal+l1.val+ l2.val-10;
                bal=1;
            }else {
                finalValue.val=bal+l1.val+ l2.val;
                bal=0;
            }
            finalValue.next=addNumbers(l1.next,l2.next,bal);
        }
        return finalValue;
    }
}
