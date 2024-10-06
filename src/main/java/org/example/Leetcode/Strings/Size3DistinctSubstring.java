package main.java.org.example.Leetcode.Strings;

import java.util.*;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/?envType=problem-list-v2&envId=sliding-window
public class Size3DistinctSubstring {

    public static void main(String[] args) {
        String s="xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }
    public static int countGoodSubstrings(String s) {
        int count=0;
        int n=s.length();
        String subs="";
        for(int i=0;i+2<n;i++) {
            if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+1)!=s.charAt(i+2)&&s.charAt(i)!=s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
//    public static int countGoodSubstrings(String s) {
//        int count=0;
//        int n=s.length();
//        int i=0,j=0;
//        List<String> list=new ArrayList<>();
//        while(j<n){
//            if(!list.contains(String.valueOf(s.charAt(j)))){
//                list.add(String.valueOf(s.charAt(j)));
//            }else{
//                if(list.size()==2&&list.indexOf(String.valueOf(s.charAt(j)))==0){
//                    list.remove(0);
//                    list.add(String.valueOf(s.charAt(j)));
//                }else if(list.size()==2&&list.indexOf(String.valueOf(s.charAt(j)))==1){
//                    list.remove(0);
//                }
//            }
//            if(j-i+1<3){
//                j++;
//            }else if(j-i+1==3){
//                if(list.size()==3){
//                    count++;
//                    list.remove(0);
//                }
//                i++;
//                j++;
//            }
//        }
//        return count;
//    }
}
