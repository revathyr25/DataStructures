package main.java.org.example.Leetcode.Greedy;
//https://leetcode.com/problems/lemonade-change/description/
public class Lemonade {
    public static void main(String[] args) {
        int[] arr={5,5,10,10,20};
        System.out.println(lemonadeChange(arr));
    }
    public static boolean lemonadeChange(int[] bills) {
        int fiveCount=0;
        int tenCount=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveCount++;
            }else if(bills[i]==10){
                if(fiveCount>=1){
                    fiveCount--;
                    tenCount++;
                }else{
                    return false;
                }
            }else {
                if(fiveCount>=1&&tenCount>=1){
                    fiveCount--;
                    tenCount--;
                }else if(fiveCount>=3){
                    fiveCount=fiveCount-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
