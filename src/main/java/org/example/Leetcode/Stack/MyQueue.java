package main.java.org.example.Leetcode.Stack;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> stack1;

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        myQueue.pop();
        System.out.println(myQueue.empty());
    }
    public MyQueue() {
        stack=new Stack<>();
        stack1=new Stack<>();
    }

    public void push(int x) {
        if(stack.size()==stack1.size()){
            stack.add(x);
        }else{
            if(stack.isEmpty()&&!stack1.isEmpty()){
                while(stack1.size()!=0){
                    stack.add(stack1.pop());
                }
            }
            stack.add(x);
        }
    }

    public int pop() {
        if(stack.isEmpty()&&stack1.isEmpty()){
            return -1;
        }else if(stack.isEmpty()&&!stack1.isEmpty()){
            return stack1.pop();
        }else{
            while(stack.size()!=1){
                stack1.add(stack.pop());
            }
            return stack.pop();
        }
    }

    public int peek() {
        if(stack.isEmpty()&&stack1.isEmpty()){
            return -1;
        }else if(stack.isEmpty()&&!stack1.isEmpty()){
            return stack1.peek();
        }else{
            while(stack.size()!=0){
                stack1.add(stack.pop());
            }
            return stack1.peek();
        }
    }

    public boolean empty() {
        if(stack.isEmpty()&&stack1.isEmpty()){
            return true;
        }
        return false;
    }
}
