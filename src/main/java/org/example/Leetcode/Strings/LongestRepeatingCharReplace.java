package main.java.org.example.Leetcode.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=string
public class LongestRepeatingCharReplace {

    public static void main(String[] args) {
        String s="AABABBA";
        System.out.println(characterReplacement(s,1));
    }
//    public static int characterReplacement(String s, int k) {
//        int max=0;
//        int n=s.length();
//        int i=0,j=0;
//        HashMap<Character,Integer> map=new HashMap<>();
//        while(j<n) {
//            if(map.containsKey(s.charAt(j))){
//                i=Math.max(map.get(s.charAt(j))+1,i);
//            }
//            map.put(s.charAt(j),j);
//            max=Math.max(max,j-i+1);
//            j++;
//        }
//        return max;
//    }
    public static int characterReplacement(String s, int k) {
        int max=0;
        int n=s.length();
        int i=0,j=0;
        int maxValue=0;
        HashMap<Character,Integer> map=new HashMap<>();
//        while(j<n) {
//            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
//            map.forEach((key,value)->{ maxValue=Math.max(maxValue,value)});
//            while(map.size()>k+1){
//                map.put(s.charAt(i),map.get(s.charAt(i))-1);
//                if(map.get(s.charAt(i))==0){
//                    map.remove(s.charAt(i));
//                }
//                i++;
//            }
//            max=Math.max(max,j-i+1);
//            j++;
//        }
        return max;
    }
}
