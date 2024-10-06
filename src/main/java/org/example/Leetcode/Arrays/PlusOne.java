package main.java.org.example.Leetcode.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOneObj=new PlusOne();
        int[] arr={5,9,6,9,9};
        System.out.println(Arrays.toString(plusOneObj.plusOne(arr)));
    }
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0]=1;
        return digits;
    }
    //my first solution
//    public int[] plusOne(int[] digits) {
//        int n=digits.length-1;
//        int bal=1;
//        for(int i=n;i>=0;i--){
//            if(digits[i]+bal==10){
//                digits[i]=0;
//                bal=1;
//            }else {
//                digits[i]=digits[i]+bal;
//                bal=0;
//            }
//        }
//        if(bal!=0){
//            digits = new int[digits.length + 1];
//            digits[0]=1;
//        }
//        return digits;
//    }
}
