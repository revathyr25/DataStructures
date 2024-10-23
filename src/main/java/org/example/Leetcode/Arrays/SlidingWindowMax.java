package main.java.org.example.Leetcode.Arrays;

import java.util.*;

//https://leetcode.com/problems/sliding-window-maximum/description/
public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums={-7,-8,7,5,7,1,6,0};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,4)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        Deque<Integer> queueMax=new LinkedList<>();
        Queue<Integer> queue=new LinkedList<>();
        int i=0,j=0;
        while(j<nums.length){
            if(j<k){
                queue.add(nums[j]);
                if(!queueMax.isEmpty()&&queueMax.peek()<nums[j]){
                    while(!queueMax.isEmpty()){
                        queueMax.pollFirst();
                    }
                }else {
                    while (!queueMax.isEmpty() && queueMax.getLast() < nums[j]) {
                        queueMax.pollLast();
                    }
                }
                queueMax.addLast(nums[j]);
                j++;
            }
            else if(j>=k){
                result[i]=queueMax.peek();
                if(Objects.equals(queueMax.peek(), queue.peek())){
                    queueMax.pollFirst();
                }
                if(!queueMax.isEmpty()&&queueMax.peek()<nums[j]){
                    while(!queueMax.isEmpty()){
                        queueMax.pollFirst();
                    }
                    queueMax.addLast(nums[j]);
                }else{
                    while(!queueMax.isEmpty()&&queueMax.getLast()<nums[j]){
                        queueMax.pollLast();
                    }
                    queueMax.addLast(nums[j]);
                }
                queue.poll();
                queue.add(nums[j]);
                i++;
                j++;
            }
        }
        result[i]=queueMax.peek();
        return result;
    }
}
