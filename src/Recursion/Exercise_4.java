package Recursion;

public class Exercise_4 {

   /* Given integers n and k write a function that returns the value of nk . Use two different recursive approaches.*/

       public static int powerSimple(int l, int k) {

           if (k == 0) {
               return 1; // Base case:
           }
           else
               return l * powerSimple(l, k - 1);   // Recursive case:

       }


   }


