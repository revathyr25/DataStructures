package main.java.org.example.Learning.Arrays;

import java.util.HashMap;
import java.util.Map;
//print the largest subArray length with sum k
public class LargestSubArraySumK {

    public static void main(String[] args) {
        int[] nums= new int[]{0,0,0};
        System.out.println(subarraySum(nums,0));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Long,Integer> map=new HashMap<>();
        long prefixSum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum==k){
                result=Math.max(result,i+1);
            }
            if(map.containsKey(prefixSum-k)){
                result=Math.max(result,i-map.get(prefixSum-k));
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }
        return result;
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
}
