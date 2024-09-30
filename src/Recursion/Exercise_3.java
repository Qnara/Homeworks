package Recursion;

public class Exercise_3 {

    /* Factorial of a non-negative integer is a multiplication of all integers smaller than or equal to n.
For example factorial of 6 is 6*5*4*3*2*1 which is 720. Write a function int fact(int n) that
returns the factorial of n. Use recursion.  */

        public static int fact(int m) {
            // Base case: factorial of 0 or 1 is 1
            if (m <=  1) {
                return 1;    // Base case:
            }
            else
                return m * fact(m - 1);   // Recursive case:
        }

    }




