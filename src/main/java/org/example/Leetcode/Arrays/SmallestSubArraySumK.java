package main.java.org.example.Leetcode.Arrays;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=sliding-window
public class SmallestSubArraySumK {

    public static void main(String[] args) {
        int[] nums= new int[]{1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(11,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        long sum=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                min=Math.min(min,(j-i+1));
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        return (min==Integer.MAX_VALUE?0:min);
    }
//    public static int minSubArrayLen(int target, int[] nums) {
//        int i=0,j=0;
//        long sum=0;
//        int min=0;
//        while(j<nums.length){
//            if(nums[j]>=target){
//                return 1;
//            }
//            sum=sum+nums[j];
//            if(sum<target){
//                j++;
//            }else if(sum>=target){
//                while(sum>=target){
//                    if(min!=0){
//                        min=Math.min(min,(j-i+1));
//                    }else{
//                        min=j-i+1;
//                    }
//                    sum=sum-nums[i];
//                    i++;
//                }
//                j++;
//            }
//        }
//        return min;
//    }
}
