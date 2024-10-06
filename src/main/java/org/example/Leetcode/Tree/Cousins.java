package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cousins {

    //using queue
//    public boolean isCousins(TreeNode root, int x, int y) {
//        if(root.val==x||root.val==y){
//            return false;
//        }
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize= queue.size();
//            List<Integer> list=new ArrayList<>();
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=queue.poll();
//                int a=0,b=0;
//                if(currentNode.left!=null){
//                    queue.offer(currentNode.left);
//                    a=currentNode.left.val;
//                    list.add(a);
//                }if(currentNode.right!=null){
//                    queue.offer(currentNode.right);
//                    b=currentNode.right.val;
//                    list.add(b);
//                }
//                if((a==x&&b==y)||(a==y&&b==x)){
//                    return false;
//                }
//            }
//            if(list.contains(x)&&list.contains(y)){
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val==x||root.val==y){
            return false;
        }
        return false;
    }
}
