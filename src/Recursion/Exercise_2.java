package Recursion;
public class Exercise_2 {

        /* The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence
relation:
Fn= Fn-1 + Fn-2
with seed values:
FO = 0 and F1 = 1
Write a function int fib(int n) that returns Fn (n-th Fibonacci number). Use recursion. Is there a better way of doing this? */

            public static int fib(int n) {
                if (n <= 1) {
                    return n;  // Base case:
                } else
                    return fib(n - 1) + fib(n - 2);  // Recursion for F(n) = F(n-1) + F(n-2)
            }

    }
