import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {

        System.out.println("-------Exercise_1-------");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Reverse:  ");
        Reverse(arr); // Call the method to print in reverse waveform


        System.out.println("-------Exercise_2-------");
        sum0(8, 0);
        sum0("Hello, ", "Mami!");

    }

 /* 1. Write a program that given a 2D array prints it in reverse waveform. */

    public static void Reverse(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int col = cols - 1; col >= 0; col--) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }


        }
        System.out.println();

    }

    /* 2. Write a method(s) sumO such that depending on the parameter types performs appropriate operations. If the input parameters are strings, print their concatenation. If they are integers, print their sum. */

    public static void sum0(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    public static void sum0(String a, String b) {
        System.out.println("Concatenation of strings: " + a + b);

    }
}

