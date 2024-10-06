package main.java.org.example.Leetcode.Strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs= new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String ,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedS=String.valueOf(ch);;
            List<String> list=new ArrayList<>();
            if(!map.containsKey(sortedS)){
                list.add(strs[i]);
                map.put(sortedS,list);
            }else {
                list=map.get(sortedS);
                list.add(strs[i]);
            }
        }
        for(List values:map.values()){
            result.add(values);
        }
        return result;
    }
}
