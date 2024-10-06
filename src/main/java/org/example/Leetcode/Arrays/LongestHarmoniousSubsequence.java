package main.java.org.example.Leetcode.Arrays;

import java.util.Arrays;
//https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=problem-list-v2&envId=sliding-window
public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] nums= new int[]{1,1,1,1};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        int i=0,j=1;
        while(j<nums.length){
            int diff=nums[j]-nums[i];
            if(diff==1){
                max=Math.max(max,j-i+1);
            }
            if(diff<=1){
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
}
