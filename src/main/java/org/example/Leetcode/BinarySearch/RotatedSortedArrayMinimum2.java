package main.java.org.example.Leetcode.BinarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class RotatedSortedArrayMinimum2 {
    public static void main(String[] args) {
        int[] nums={1};
        int ans=search(nums);
        System.out.println(ans);

    }
    static int search(int[] nums){
        int s=0;
        int e=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<ans){
                ans=nums[mid];
            }
            if(nums[mid]==nums[s]&&nums[mid]==nums[e]){
                while(s<=e&&nums[mid]==nums[s]&&nums[mid]==nums[e]){
                    e=e-1;
                    s=s+1;
                }
            }else if(nums[mid]<=nums[e]){
               e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}
