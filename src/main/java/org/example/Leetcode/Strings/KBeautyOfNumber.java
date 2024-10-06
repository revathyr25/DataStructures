package main.java.org.example.Leetcode.Strings;

//https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/?envType=problem-list-v2&envId=sliding-window
public class KBeautyOfNumber {
    public static void main(String[] args) {
        int num=240;
        System.out.println(divisorSubstrings(num,2));
    }
    public static int divisorSubstrings(int num, int k) {
        int count=0;
        String nums=String.valueOf(num);
        int n=nums.length();
        String s="";
        for(int i=0;i+k-1<n;i++){
            s=nums.substring(i,i+k);
            if(Integer.parseInt(s)!=0&&(num%Integer.parseInt(s))==0){
                count++;
            }
        }
        return count;
    }
//    public static int divisorSubstrings(int num, int k) {
//        int count=0;
//        int n=String.valueOf(num).length();
//        int i=0,j=0;
//        StringBuilder nums=new StringBuilder(String.valueOf(num));
//        StringBuilder s=new StringBuilder();
//        while(j<n){
//            s=s.append(nums.charAt(j));
//            if(j-i+1<k){
//                j++;
//            }else if(j-i+1==k){
//                if(Integer.parseInt(s.toString())!=0&&(num%Integer.parseInt(s.toString()))==0){
//                    count++;
//                }
//                s.deleteCharAt(0);
//                i++;
//                j++;
//            }
//        }
//        return count;
//    }
}
