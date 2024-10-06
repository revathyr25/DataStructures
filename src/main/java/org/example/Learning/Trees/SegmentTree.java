package main.java.org.example.Learning.Trees;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};

    }
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root=createTree(arr,0,arr.length-1);
    }

    private Node createTree(int[] arr,int s,int e) {
        if(s==e){
            Node leaf=new Node(s,e);
            leaf.data=arr[s];
            return leaf;
        }
        Node node=new Node(s,e);
        int mid=(s+e)/2;
        node.left=createTree(arr,s,mid);
        node.right=createTree(arr,mid+1,e);
        node.data=node.left.data+node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str="";
        if(node.left!=null){
            str=str+"Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] and data: "+node.left.data+"->";
        }else{
            str=str+"No left Child";
        }

        str=str+"Interval=["+node.startInterval+"-"+node.endInterval+"] and data: "+node.data+"<-";
        if(node.right!=null){
            str=str+"Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] and data: "+node.left.data+"->";
        }else{
            str=str+"No right Child";
        }
        System.out.println(str);
        if(node.left!=null){
            display(node.left);
        }if(node.right!=null){
            display(node.right);
        }
    }
}
