package org.example.BinarySearch;

public class FloorProblem {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,16,17,18};
        int target=1;
        int ans=floor(arr,target);
        System.out.println(ans);

    }
    static int floor(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        if(e==0||target<arr[s]){
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
        return arr[e];
    }
}
