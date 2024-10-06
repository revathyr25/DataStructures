package main.java.org.example.Learning.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter k (the position of the largest element to find): ");
        int k = scanner.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid value of k.");
            return;
        }

        // Create a min-heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }

        // The root of the min-heap is the k-th largest element
        int kthLargest = minHeap.peek();

        System.out.println("The " + k + "th largest element is: " + kthLargest);

        scanner.close();
    }
}

