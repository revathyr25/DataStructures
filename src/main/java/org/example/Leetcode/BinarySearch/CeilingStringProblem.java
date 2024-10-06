package main.java.org.example.Leetcode.BinarySearch;

public class CeilingStringProblem {
    public static void main(String[] args) {
        char[] arr={'c','f','g'};
        char target='c';
        char ans=ceiling(arr,target);
        System.out.println(ans);

    }
    static char ceiling(char[] letters,char target){
        int s=0;
        int n=letters.length;
        int e=letters.length-1;


        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]>target){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return letters[s%n];
    }
}
