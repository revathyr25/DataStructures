package main.java.org.example.Leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        HashMap<Integer,Integer> nums1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                int value=target-nums[i];
                if(nums1.containsKey(value)){
                    a[0]=i;
                    a[1]=nums1.get(value);
                    return a;
                }
                nums1.put(nums[i],i);
        }
        return a;
    }
}
