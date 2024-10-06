package main.java.org.example.Leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array
public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int a = (arr[i]<0) ? arr[i]*-1 : arr[i];
            if(arr[a-1]<0) ans.add(a);
            else arr[a-1]*=-1;
        }

        return ans;
    }
}
