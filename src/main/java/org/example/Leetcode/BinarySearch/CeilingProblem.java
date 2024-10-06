package main.java.org.example.Leetcode.BinarySearch;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,16,17,18};
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        if(e==0||target>arr[e]){
            return -1;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[s];
    }
}
