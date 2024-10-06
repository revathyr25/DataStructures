package main.java.org.example.Leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArraySumK {

    public static void main(String[] args) {
        int[] nums= new int[]{0,0,0};
        System.out.println(subarraySum(nums,0));
    }
//    public static int subarraySum(int[] nums, int k) {
//        int sum = 0, result = 0;
//        Map<Integer,Integer> preSum = new HashMap<>();
//        preSum.put(0,1);
//        for(int i=0 ; i<nums.length;i++){
//            sum = sum +nums[i];
//            if(preSum.containsKey(sum-k)){
//                result = result + preSum.get(sum-k);
//            }
//            preSum.put(sum,preSum.getOrDefault(sum,0)+1);
//        }
//        return result;
//    }
//    public static int subarraySum(int[] nums, int k) {
//        int i=0,j=0;
//        long sum=0;
//        int max=0;
//        while(j<nums.length){
//            sum=sum+nums[j];
//            if(sum<k){
//                j++;
//            }else if(sum==k){
//                max=Math.max(max,(j-i+1));
//                sum=sum-nums[i];
//                i++;
//                j++;
//            }else{
//                sum=sum-nums[i];
//                i++;
//                j++;
//            }
//        }
//        return max;
//    }

//    public static int subarraySum(int[] nums, int k) {
//        Map<Long, Integer> map = new HashMap<>();
//        long prefixSum = 0;
//        int result = 0;
//        map.put(prefixSum,1);
//        for (int i = 0; i < nums.length; i++) {
//            prefixSum+=nums[i];
//            if(prefixSum==k){
//                result++;
//            }
//            if(map.containsKey(prefixSum-k)){
//                result++;
//            }
//            if(!map.containsKey(prefixSum)){
//                map.put(prefixSum,i);
//            }
//
//        }
//        return result;
//    }
    public static int subarraySum(int[] nums, int k) {
        Map<Long,Integer> map=new HashMap<>();
        long prefixSum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k)){
                result=result+map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return result;
    }
}
