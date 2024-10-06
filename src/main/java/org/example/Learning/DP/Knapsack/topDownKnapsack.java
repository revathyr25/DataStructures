package main.java.org.example.Learning.DP.Knapsack;


public class topDownKnapsack {

    public static void main(String[] args) {
        topDownKnapsack memoizeKnapsack=new topDownKnapsack();
        int[] weight={1,3,4,5};
        int[] value={1,4,5,6};
        int i=-1;
        System.out.println(memoizeKnapsack.knapsack(weight,value,7,weight.length));
    }
    public int knapsack(int[] weight,int[] value, int maxWeight,int n){
        int[][] t=new int[n+1][maxWeight+1];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<maxWeight+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }

        for(int i=1;i<n+1;i++)
            for(int j=1;j<maxWeight+1;j++){
                if(weight[i-1]<=j){
                    t[i][j]=Math.max(value[i-1]+t[i-1][j-weight[i-1]],t[i-1][j]);
                }else if(weight[i-1]>j) {
                    t[i][j]=t[i-1][j];
                }
            }
        return t[n][maxWeight];
    }
}
