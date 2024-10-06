package main.java.org.example.Leetcode.BinarySearch;

public class FirstPosInfiniteArrayProblem {
    public static void main(String[] args) {
        int[] arr={2,3,9,9,9,9,16,17,18};
        int target=9;
        int ans=answer(arr,target);
        System.out.println(ans);

    }

    static int answer(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=(end-start+1)*2+end;
            start=newStart;
        }
        return search(arr,target,start,end);

    }
    static int search(int[] arr,int target, int s,int e){

        if(e==0||target>arr[e]){
            return -1;
        }
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
}
