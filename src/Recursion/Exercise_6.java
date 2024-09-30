package Recursion;

public class Exercise_6 {

    /* Given an array, write a function to print the elements of the given array in reversed order. Use  recursion. */
    public static void printReverse(int[] arr, int a) {

        if (a == 0) {
            return;  // Base case:
        }
        else

            System.out.print(arr[a-1] + " ");  // Recursive case:
        printReverse(arr, a - 1);
    }





}
