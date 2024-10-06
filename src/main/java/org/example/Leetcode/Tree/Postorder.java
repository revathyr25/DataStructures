package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return postorder(list,root);
    }

    public List<Integer> postorder(List<Integer> list,TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        if(node.left!=null){
            postorder(list,node.left);
        }
        if(node.right!=null){
            postorder(list,node.right);
        }
        list.add(node.val);
        return list;
    }
}
