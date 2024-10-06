package main.java.org.example.Leetcode.Tree;

import org.example.Learning.Trees.Node;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int height;

    public TreeNode(int val){
        this.val=val;
    }
    public TreeNode(){
    }
    public int getValue(){
        return val;
    }
}
