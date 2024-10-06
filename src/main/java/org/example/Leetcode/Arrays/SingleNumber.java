package main.java.org.example.Leetcode.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber=new SingleNumber();
        int[] arr={2,1,2,1,4};
        System.out.println(singleNumber.singleNumber(arr));
    }
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
//    public int singleNumber(int[] nums) {
//        if(nums.length==1){
//            return nums[0];
//        }
//        int i=0;
//        Arrays.sort(nums);
//        int count=0;
//        while(i<nums.length-1){
//            if(nums[i]==nums[i+1]){
//                count++;
//            }else {
//                if(count==0){
//                    return nums[i];
//                }
//                count=0;
//            }
//            i++;
//        }
//        return nums[i];
//    }
}
