package main.java.org.example.Leetcode.Greedy;
//https://leetcode.com/problems/assign-cookies/description/
import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1,2,3,4};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        while(j<m&&i<n){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
