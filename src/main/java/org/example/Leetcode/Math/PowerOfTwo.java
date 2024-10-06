package main.java.org.example.Leetcode.Math;
//https://leetcode.com/problems/power-of-two/description/
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
    public static boolean isPowerOfTwo(int n) {
        return (n>0)&&((n &(n-1))==0);
    }
//    public static boolean isPowerOfTwo(int n) {
//        int result1 = (int)(Math.log(n) / Math.log(2));
//        if(n>0&&n==(int)Math.pow(2,result1)){
//            return true;
//        }
//        return false;
//    }
}
