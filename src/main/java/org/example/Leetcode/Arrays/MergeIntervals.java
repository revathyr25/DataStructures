package main.java.org.example.Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals=new int[2][2];
        intervals[0][0]=1;
        intervals[0][1]=4;
        intervals[1][0]=1;
        intervals[1][1]=4;
//        intervals[2][0]=8;
//        intervals[2][1]=10;
//        intervals[3][0]=8;
//        intervals[3][1]=9;
//        intervals[4][0]=9;
//        intervals[4][1]=11;
//        intervals[5][0]=15;
//        intervals[5][1]=18;
//        intervals[6][0]=2;
//        intervals[6][1]=4;
//        intervals[7][0]=16;
//        intervals[7][1]=17;
//        intervals[8][0]=20;
//        intervals[8][1]=21;
        System.out.println(merge(intervals).toString());
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0])
                .thenComparingInt(a -> a[1]));
        List<List<Integer>> list=new ArrayList<>();
        int j=0;
        for(int i=0;i<intervals.length;){
            List<Integer> list2=new ArrayList<>();
            if(list.size()!=0&&list.get(list.size()-1).get(1)>=intervals[i][0]&&list.get(list.size()-1).get(1)<=intervals[i][1]){
                list.get(list.size()-1).set(1,intervals[i][1]);
                i++;
            }else if(list.size()!=0&&list.get(list.size()-1).get(1)>intervals[i][1]){
                i++;
            }
            else{
                list2.add(intervals[i][0]);
                list2.add(intervals[i][1]);
                list.add(list2);
                i++;
            }
        }
        int[][] result= list.stream()
                .map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        return result;
    }
}
