package main.java.org.example.Learning.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         BinaryTree tree = new BinaryTree();
//         tree.populate(scanner);
//         tree.prettyDisplay();
//
//
//        BST tree1 = new BST();
//        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//        tree1.populate(nums);
//        tree1.display();
//
//        AVL tree2 = new AVL();
//
//        for(int i=0; i < 1000; i++) {
//            tree2.insert(i);
//        }
//        tree2.prettyDisplay();
//        System.out.println(tree2.height());

        int[] arr = { 3,8,6,7,-2,-8,4,-9 };
        SegmentTree tree3=new SegmentTree(arr);
        tree3.display();
    }
}
