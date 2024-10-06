package main.java.org.example.Leetcode.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s="leelal";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Queue<Character> queue=new LinkedList<>();
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            queue.offer(s.charAt(i));
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int i=0;
        while(!queue.isEmpty()){
            char c=queue.poll();
            if(map.get(c)==1){
                return i;
            }
            i++;
        }
        return -1;
    }
}
