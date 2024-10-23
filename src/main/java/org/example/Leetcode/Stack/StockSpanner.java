package main.java.org.example.Leetcode.Stack;


import java.util.Stack;

//https://leetcode.com/problems/online-stock-span/description/
public class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }

    public static void main(String[] args) {
        int[] nums={100,80,60,70,60,75,85};
        System.out.println();
    }

    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span+=stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
