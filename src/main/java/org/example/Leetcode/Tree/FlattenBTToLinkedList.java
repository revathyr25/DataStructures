package main.java.org.example.Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class FlattenBTToLinkedList {
    public void flatten(TreeNode root) {
        TreeNode node=new TreeNode();
        node=root;
        flattenList(node,root);
    }

    public TreeNode flattenList(TreeNode node,TreeNode root) {
        if (root != null) {
            node.left=null;
            if(node!=root){
                node.right=root;
            }
            if (root.left != null) {
                flattenList(node, root.left);
            }
            if (node.right != null) {
                flattenList(node, root.right);
            }
        }
        return node;
    }
}
