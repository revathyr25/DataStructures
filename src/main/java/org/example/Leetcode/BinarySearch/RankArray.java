package main.java.org.example.Leetcode.BinarySearch;

import java.util.Arrays;

import java.util.Arrays;

public class RankArray {
    public static int[] rankArray(int[] arr) {
        int n = arr.length;

        // Create a copy of the original array
        int[] sortedArray = Arrays.copyOf(arr, n);

        // Sort the copied array
        Arrays.sort(sortedArray);

        // Create an array to hold ranks
        int[] ranks = new int[n];

        // Create a map to hold the ranks of unique elements
        int[] rankMap = new int[n];
        int rank = 1;

        // Assign ranks based on unique values
        for (int i = 0; i < n; i++) {
            // Only assign a rank if it's the first occurrence of the element
            if (i == 0 || sortedArray[i] != sortedArray[i - 1]) {
                rankMap[i] = rank++;
            } else {
                rankMap[i] = rankMap[i - 1]; // Same rank as the previous element
            }
        }

        // Populate the ranks based on the original array values
        for (int i = 0; i < n; i++) {
            ranks[i] = rankMap[Arrays.binarySearch(sortedArray, arr[i])];
        }

        return ranks;
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30, 20};
        int[] rankedArray = rankArray(arr);
        System.out.println(Arrays.toString(rankedArray)); // Output: [4, 1, 2, 3, 2]
    }
}
