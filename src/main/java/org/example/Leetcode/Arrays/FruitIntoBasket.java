package main.java.org.example.Leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/fruit-into-baskets/description/?envType=problem-list-v2&envId=sliding-window
public class FruitIntoBasket {

    public static void main(String[] args) {
        int[] nums= new int[]{1,2,1};
        System.out.println(totalFruit(nums));
    }
    public static int totalFruit(int[] fruits) {
        int max=0;
        int n=fruits.length;
        int i=0,j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n) {
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            if(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
    //this is o(N+N)
//    public static int totalFruit(int[] fruits) {
//        int max=0;
//        int n=fruits.length;
//        int i=0,j=0;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        while(j<n) {
//            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
//            if(map.size()>2){
//                while(map.size()>2){
//                    map.put(fruits[i],map.get(fruits[i])-1);
//                    if(map.get(fruits[i])==0){
//                        map.remove(fruits[i]);
//                    }
//                    i++;
//                }
//            }
//            max=Math.max(max,j-i+1);
//            j++;
//        }
//        return max;
//    }
}
