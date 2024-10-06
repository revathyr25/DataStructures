package main.java.org.example.Leetcode.Strings;

import java.util.HashMap;
//https://leetcode.com/problems/permutation-in-string/description/
public class PermutationInString {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcaabdbcdeafgbcdiabcbbcaabclcabcababccab";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int n=s1.length();
        int m=s2.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        while(j<m){
            if(map.containsKey(s2.charAt(j))) {
                map.put(s2.charAt(j),map.get(s2.charAt(j))-1);
                if(map.get(s2.charAt(j))==0){
                    map.remove(s2.charAt(j));
                }
                if(map.isEmpty()){
                    return true;
                }
                j++;
            }else if(!map.isEmpty()){
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)+1);
                i++;
            }else{
                i++;
                j++;
            }
        }
        return false;
    }
}
