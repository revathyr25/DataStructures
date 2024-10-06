package main.java.org.example.Leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumAverageSubArray1 {

    public static void main(String[] args) {
        int[] nums= new int[]{-1};
        System.out.println(findMaxAverage(nums,1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        long sum=0;
        double max=Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            sum=sum+nums[j];
            if(j-i+1==k){
                double avg=(double)sum/(j-i+1);
                max=Math.max(max,avg);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
}
