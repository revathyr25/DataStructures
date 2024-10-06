package main.java.org.example.Leetcode.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums= new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        int j=1;
        int n=nums.length;
       for(int i=1;i<n;i++){
           if(nums[i]!=nums[i-1]) {
               nums[j] = nums[i];
               j++;
           }
        }
        return j;
    }
//    public static int removeDuplicates(int[] nums){
//        int i=0;
//        int j=1;
//        int n=nums.length;
//        while(j<n){
//            if(nums[i]==nums[j]){
//                while(nums[i]==nums[j]&&j<n){
//                    j++;
//                    if(j==n){
//                        return i+1;
//                    }
//                }
//            }
//            nums[i+1]=nums[j];
//            i++;
//            j++;
//        }
//        return i+1;
//    }
}
