package Recursion;

public class Exercise_8 {

    /* Given a number n, find the sum of its digits. Use recursion. */

    public static int sumOfDigits(int c) {
        if (c == 0) {
            return 0;  // Base case:
        } else
            return (c % 10) + sumOfDigits(c / 10);  // Recursive case:
    }

}

