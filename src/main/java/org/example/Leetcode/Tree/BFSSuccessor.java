package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSSuccessor {
    public static void main(String[] args) {
        
    }

    public Integer levelOrder(TreeNode root,int n){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val==n){
                return queue.poll().val;
            }
        }
        return null;
    }
}
