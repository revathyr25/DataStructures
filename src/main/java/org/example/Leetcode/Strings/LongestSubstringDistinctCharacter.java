package main.java.org.example.Leetcode.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=string
public class LongestSubstringDistinctCharacter {

    public static void main(String[] args) {
        String s="bacab";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n) {
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }
            map.put(s.charAt(j),j);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
//    public static int lengthOfLongestSubstring(String s) {
//        int max=0;
//        int n=s.length();
//        int i=0,j=0;
//        Set<Character> set=new HashSet<>();
//        while(j<n) {
//            if(!set.contains(s.charAt(j))){
//                set.add(s.charAt(j));
//                max=Math.max(max,set.size());
//            } else{
//                while(s.charAt(i)!=s.charAt(j)){
//                    set.remove(s.charAt(i));
//                    i++;
//                }
//                i++;
//            }
//            j++;
//        }
//        return max;
//    }
}
