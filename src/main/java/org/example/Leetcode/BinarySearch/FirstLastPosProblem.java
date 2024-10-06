package main.java.org.example.Leetcode.BinarySearch;

public class FirstLastPosProblem {
    public static void main(String[] args) {
        int[] arr={2,7,7,7,7,7,17,18};
        int target=7;
        int[] ans=pos(arr,target);
        System.out.println(ans[0]+","+ans[1]);

    }
    static int[] pos(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=search(arr,target,false);
        }

        return ans;
    }

    static int search(int[] nums,int target,boolean findStartIndex){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        if(e==0||target>nums[e]){
            return ans;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                ans=mid;
                if(findStartIndex){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}
