package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
public class BFSLevelOrder2 {

    public List<List<Integer>> levelOrder2(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(0,currentLevel);
        }
        return result;
    }
}
