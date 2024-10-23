package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.java.org.example.Leetcode.Tree.TreeNode;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
public class KthLargestSum {

    public long kthLargestLevelSum(TreeNode root, int k) {
        List<List<Integer>> result=new ArrayList<>();
        long sum=0;
        long max=0;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Long> levelSum=new ArrayList<>();
        while(!queue.isEmpty()){
            sum=0;
            int levelSize= queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                sum=sum+currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            levelSum.add(sum);
        }
        levelSum.stream().sorted();
        return levelSum.get(levelSum.size()-k);
    }
}
