package main.java.org.example.Leetcode.BinarySearch;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums={8};
        int target=7;
        int ans=searchInsert(nums,target);
        System.out.println(ans);

    }
    static int searchInsert(int[] nums,int target){
        int s=0;
        int e=nums.length-1;

        while(s<=e){
            if(target<nums[s]){
                return s;
            }
            if(target>nums[e]){
                return e+1;
            }
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                return mid;
            }
        }
        return nums[s];
    }
}
