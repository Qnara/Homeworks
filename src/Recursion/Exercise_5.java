package Recursion;

public class Exercise_5 {

/*Given an array, write functions to find the minimum and the maximum elements in it. Use recursion. */

    public static int findMin(int[] arrmin, int min) {
        if (min == 1) {
            return arrmin[0];  // Base case:
        }
        else
        return Math.min(arrmin[min - 1], findMin(arrmin, min - 1)); // Recursive case:
    }

    public static int findMax(int[] arrmax, int max) {

        if (max == 1) {
            return arrmax[0];    // Base case:
        }
        else
        return Math.max(arrmax[max - 1], findMax(arrmax, max - 1));  // Recursive case:
    }




}
