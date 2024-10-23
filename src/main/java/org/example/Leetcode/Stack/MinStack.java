package main.java.org.example.Leetcode.Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    int min=0;
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
    public MinStack() {
        stack=new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            min=val;
            stack.push(val);
        }else if(min>val){
            long n= 2L *val;
            int m=(int)(n-(long)min);
            stack.push(m);
            min=val;
        }else {
            stack.push(val);
        }

    }

    public void pop() {
        if(stack.peek()<min){
            min=(2*min)-stack.peek();
            stack.pop();
        }else {
            stack.pop();
        }
    }

    public int top() {
        if(stack.peek()<min){
            return min;
        }
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

//using O(n) space complexity
//public class MinStack {
//    Stack<Integer> stack;
//    Stack<Integer> stack2;
//
//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin()); // return -3
//        minStack.pop();
//        System.out.println(minStack.top());    // return 0
//        System.out.println(minStack.getMin());
//    }
//    public MinStack() {
//        stack=new Stack<>();
//        stack2=new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if(stack2.isEmpty()||(!stack2.isEmpty()&&val<=stack2.peek())){
//            stack2.push(val);
//        }
//    }
//
//    public void pop() {
//        int a=stack.pop();
//        if(a==stack2.peek()){
//            stack2.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return stack2.peek();
//    }
//}
