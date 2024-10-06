package main.java.org.example.Leetcode.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class RankTransform {
    public static void main(String[] args) {
        int[] arr={40,10,20,30,20};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        for (int i=0;i<arr.length;i++){
            arr[i]=search(arr2,arr[i])+1;
        }
        return arr;
    }

    static int search(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                return mid;
            }
        }
        return s;
    }
}
