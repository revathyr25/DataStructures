package main.java.org.example.Learning.Arrays;

import java.util.Arrays;
//remove duplicates in a sorted array without extra space.

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums= new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    public static int[] removeDuplicates(int[] nums){
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            if(nums[i]==nums[j]){
                while(nums[i]==nums[j]&&j<n){
                    nums[j]=0;
                    j++;
                    if(j==n){
                        return nums;
                    }
                }
            }
            nums[i+1]=nums[j];
            nums[j]=0;
            i++;
            j++;
        }
        return nums;
    }
}
