package main.java.org.example.Leetcode.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description
public class RotatedSortedArraySearch2 {
    public static void main(String[] args) {
        int[] nums={1};
        int target=0;
        System.out.println(search(nums,target));

    }
    static boolean search(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]==nums[s]&&nums[mid]==nums[e]){
                while(s<=e&&nums[mid]==nums[s]&&nums[mid]==nums[e]){
                    e=e-1;
                    s=s+1;
                }
            }else if(nums[mid]>=nums[s]){
                if(target<nums[mid]&&target>=nums[s]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[e]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }
        return false;
    }
}
