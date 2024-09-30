package Recursion;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------Exercise_2-------");
            int n = 10;  // Example input
            System.out.println("Fibonacci number " + n + " is: " +  Exercise_2.fib(n));

        System.out.println("-------Exercise_3-------");
            int m = 6;  // Example input
            System.out.println("Factorial of " + m + " is: " + Exercise_3.fact(m));

        System.out.println("-------Exercise_4-------");
            int l = 3, k = 4;  // Example input
            System.out.println(l + " raised to the power of " + k + " is: " + Exercise_4.powerSimple(l, k));

        System.out.println("-------Exercise_5-------");

            int[] arrmin = {32, 55, 1, 92, 2};  // Example array
            System.out.println("Minimum element is: " + Exercise_5.findMin(arrmin, arrmin.length));

            int[] arrmax = {23, 56, 1, 19, 20};  // Example array
            System.out.println("Maximum element is: " + Exercise_5.findMax(arrmax, arrmax.length));

        System.out.println("-------Exercise_6-------");
            int[] arr = {10, 25, 53, 4, 15};  // Example array
            System.out.print("Reverse array: ");
                Exercise_6.printReverse(arr, arr.length);

        System.out.println("\n" + "-------Exercise_7-------");

        String str = "abccbad";  // Example input
        if (Exercise_7.isPalindromeRecursive(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        System.out.println("-------Exercise_8-------");
            int c = 562345;  // Example input
            System.out.println("Sum of digits of " + c + " is: " + Exercise_8.sumOfDigits(c));

    }
}





