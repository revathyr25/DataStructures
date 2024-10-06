package main.java.org.example.Leetcode.Arrays;

public class Stocks {
    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
//        int[] prices=new int[]{2,1,2,1,0,1,7};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int ans=0;
        int min=prices[0];
        int max=prices[prices.length-1];
        for(int i=0,j=prices.length-1;i+1<=j;){
            if(max-min>ans){
                ans=max-min;
            }
            if(prices[i]>=prices[i+1]){
                if(prices[i+1]<min){
                    min=prices[i+1];
                }
                i++;
            }else{
                if((prices[j-1]<max) && (max-prices[j-1]>ans)){
                    ans=max-prices[j-1];
                }else{
                    if(prices[j-1]>max){
                        max=prices[j-1];
                    }
                }
                j--;
            }
        }
        if(max-min>ans){
            return max-min;
        }
        return ans;
    }
}

