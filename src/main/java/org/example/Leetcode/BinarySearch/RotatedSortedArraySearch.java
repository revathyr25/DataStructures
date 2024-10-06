package main.java.org.example.Leetcode.BinarySearch;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,8,1,2,3};
        int target=8;
        int ans=search(nums,target);
        System.out.println(ans);

    }
    static int search(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
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
        return -1;
    }
}
