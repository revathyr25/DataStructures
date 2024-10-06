package main.java.org.example.Learning.DP.Knapsack;

import java.util.Arrays;

public class memoizeKnapsack {
    static int[][] t=new int[102][1002];
    public static void main(String[] args) {
        memoizeKnapsack memoizeKnapsack=new memoizeKnapsack();
        int[] weight={1,3,4,5};
        int[] value={1,4,5,6};
        int i=-1;
        for(int[] cell:t){
            Arrays.fill(cell,-1);
        }
        System.out.println(memoizeKnapsack.knapsack(weight,value,7,weight.length));
    }
    public int knapsack(int[] weight,int[] value, int maxWeight,int n){
        if(n==0||maxWeight==0){
            return 0;
        }
        if(t[n][maxWeight]!=-1){
            return t[n][maxWeight];
        }
        if(weight[n-1]<=maxWeight){
            t[n][maxWeight]=Math.max(value[n-1]+knapsack(weight,value, maxWeight-weight[n-1],n-1),
                    knapsack(weight,value, maxWeight,n-1));
            return t[n][maxWeight];
        }else if(weight[n-1]>maxWeight) {
            t[n][maxWeight]= knapsack(weight,value, maxWeight,n-1);
            return t[n][maxWeight];
        }
        return 0;
    }
}
