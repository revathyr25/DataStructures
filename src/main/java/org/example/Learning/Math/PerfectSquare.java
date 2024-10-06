package main.java.org.example.Learning.Math;

public class PerfectSquare {
    public static boolean isPerfectSquare(long num) {
        // Base case: 0 and 1 are perfect squares
        if (num <= 1) {
            return true;
        }

        // Initialize boundaries for binary search
        long left = 1, right = num;

        while (left <= right) {
            // Calculate middle value
            long mid = left + (right - left) / 2;

            // Calculate square of the middle value
            long square = mid * mid;

            // If the square matches n, n is a perfect square
            if (square == num) {
                return true;
            }
            // If the square is smaller than n, search the right
            // half
            else if (square < num) {
                left = mid + 1;
            }
            // If the square is larger than n, search the left
            // half
            else {
                right = mid - 1;
            }
        }

        // If the loop completes without finding a perfect
        // square, n is not a perfect square
        return false;
    }

//    The idea is based on the fact that perfect squares are always some of first few odd numbers.
//
//            1 + 3 = 4
//            1 + 3 + 5 = 9
//            1 + 3 + 5 + 7 = 16
//            1 + 3 + 5 + 7 + 9 = 25
//            1 + 3 + 5 + 7 + 9 + 11 = 36
    public static boolean isPerfectSquare2(long n) {
        // 0 is considered as a perfect
        // square
        if (n == 0) return true;

        long odd = 1;
        while (n > 0) {
            n -= odd;
            odd += 2;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        long x = 49;
        if (isPerfectSquare(x))
            System.out.println("Yes");
        else
            System.out.println("No");
        if (isPerfectSquare2(x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
