package Recursion;

public class Exercise_7 {

    /* Given a string, write a function to check if it is palindrome or not. A string is said to be
palindrome if the reverse of the string is the same as string. For example, "abba" is a palindrome,
but "abbc" is not a palindrome. Use both recursive and non-recursive methods.*/

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if(str.charAt(start) == str.charAt(end)) {
            return true;  // Base case:
        }
        else {
        }
            return false;

        }
    }


