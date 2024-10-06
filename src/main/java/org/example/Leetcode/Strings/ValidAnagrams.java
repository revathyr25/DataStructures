package main.java.org.example.Leetcode.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s= "anagram";
        String t= "nagara";
        System.out.println(isAnagram(s,t));
        char x='b';
        System.out.println(100-'z');
    }

    public static boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)){
            return true;
        }
        return false;
    }

//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character,Integer> map=new HashMap<>();
//        if(s.length()!=t.length()){
//            return false;
//        }
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(int i=0;i<t.length();i++){
//            if(map.containsKey(t.charAt(i))&&(map.get(t.charAt(i))>0)){
//                map.put(t.charAt(i),map.get(t.charAt(i))-1);
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
}
