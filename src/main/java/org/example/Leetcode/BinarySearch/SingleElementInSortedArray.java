package main.java.org.example.Leetcode.BinarySearch;
//https://leetcode.com/problems/single-element-in-a-sorted-array/description
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={2, 2, 3, 3, 1, 4, 4};
        int ans=search(nums);
        System.out.println(ans);

    }
    static int search(int[] nums){
        if(nums.length==1||nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int s=2;
        int e=nums.length-2;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2!=0&&nums[mid]==nums[mid-1]||mid%2==0&&nums[mid]==nums[mid+1]) {
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
