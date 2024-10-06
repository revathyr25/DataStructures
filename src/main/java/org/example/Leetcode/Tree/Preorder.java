package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return preorder(list,root);
    }

    public List<Integer> preorder(List<Integer> list,TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        list.add(node.val);
        if(node.left!=null){
            preorder(list,node.left);
        }
        if(node.right!=null){
            preorder(list,node.right);
        }
        return list;
    }
}
