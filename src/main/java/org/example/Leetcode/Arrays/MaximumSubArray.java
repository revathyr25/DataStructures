package main.java.org.example.Leetcode.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums= new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
//        public static int maxSubArray(int[] nums) {
//            int n=nums.length;
//            int sum=nums[0];
//            int max=nums[0];
//            for(int i=1;i<n;i++){
//                if(sum+nums[i]>nums[i]){
//                    sum=sum+nums[i];
//                }else{
//                    sum=nums[i];
//                }
//                if(max<sum){
//                    max=sum;
//                }
//            }
//            return sum>max?sum:max;
//        }

    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            sum=(sum+nums[i]>nums[i])?sum+nums[i]:nums[i];
            if(max<sum){
                max=sum;
            }
        }
        return sum>max?sum:max;
    }
}
