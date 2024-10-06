package main.java.org.example.Leetcode.Math;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(124565421));
    }

    public static boolean isPalindrome(int x) {
        int y=0;
        int k=x;
        int f=0;
        int a=(int)Math.log10(x);
        int h=a/2;
        if(x>=0) {
            while (a > h) {
                f = (int) (k / Math.pow(10, a));
                y = x % 10;
                if (f != y) {
                    return false;
                }
                x = x / 10;
                k=k%(int)Math.pow(10, a);
                a--;
            }
        }else {
            return false;
        }
         return true;
    }
}
