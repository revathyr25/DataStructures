package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
public class BFSNextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    //without using queue
    public Node levelOrder(Node root){
        if(root==null){
            return root;
        }
        Node leftMost=root;
        while(leftMost.left!=null){
            Node currentNode=leftMost;
            while(currentNode!=null){
                currentNode.left.next=currentNode.right;
                if(currentNode.next!=null){
                    currentNode.right.next=currentNode.next.left;
                }
                currentNode=currentNode.next;
            }
            leftMost=leftMost.left;
        }
        return root;
    }
    // the below code is working but it uses queue which requires more space
//    public Node levelOrder(Node root){
////        Node result=new Node();
//        if(root==null){
//            return root;
//        }
//        Queue<Node> queue=new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize= queue.size();
//            for(int i=0;i<levelSize;i++){
//                Node currentNode=queue.poll();
//                if(i==levelSize-1){
//                    currentNode.next=null;
//                }else{
//                    currentNode.next=queue.peek();
//                }
//                if(currentNode.left!=null){
//                    queue.offer(currentNode.left);
//                }if(currentNode.right!=null){
//                    queue.offer(currentNode.right);
//                }
//
//            }
//        }
//        return root;
//    }
}
