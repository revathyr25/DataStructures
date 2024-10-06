package main.java.org.example.Leetcode.Arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums,2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length) {
            if(map.containsKey(nums[j])){
                if(j-map.get(nums[j])<=k){
                    return true;
                }
            }
            map.put(nums[j],j);
            j++;
        }
        return false;
    }
}
