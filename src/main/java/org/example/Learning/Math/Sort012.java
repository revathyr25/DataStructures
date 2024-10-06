package main.java.org.example.Learning.Math;

import java.util.Scanner;

public class Sort012 {
    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid<=high){
            switch(arr[mid]){
                case 0: {
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
                }case 1: {
                    mid++;
                    break;
                }case 2: {
                    swap(arr,high,mid);
                    high--;
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sort012(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

