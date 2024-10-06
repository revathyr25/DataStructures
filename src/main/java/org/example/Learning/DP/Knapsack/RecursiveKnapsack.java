package main.java.org.example.Learning.DP.Knapsack;

public class RecursiveKnapsack {

    public static void main(String[] args) {
        RecursiveKnapsack recursiveKnapsack=new RecursiveKnapsack();
        int[] weight={1,3,4,5};
        int[] value={1,4,5,6};
        System.out.println(recursiveKnapsack.knapsack(weight,value,7,weight.length));
    }
    public int knapsack(int[] weight,int[] value, int maxWeight,int n){
        if(n==0||maxWeight==0){
            return 0;
        }
        if(weight[n-1]<=maxWeight){
            return Math.max(value[n-1]+knapsack(weight,value, maxWeight-weight[n-1],n-1),
                    knapsack(weight,value, maxWeight,n-1));
        }else {
            return knapsack(weight,value, maxWeight,n-1);
        }
    }
}
