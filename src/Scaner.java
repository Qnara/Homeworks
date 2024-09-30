import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        System.out.println("-------Exercise_1-------");

/* Count Characters in a String
Description: Write a program that reads a string from the user and prints the total number of characters in that string.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput:");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("The string has " + length + " characters.");


        System.out.println("-------Exercise_2-------");
/* Print Each Character on a New Line
Description: Write a program that takes a string as input and prints each character of the string on a new line. */

        Scanner scanner1 = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String input1 = scanner.nextLine();
        for (int i = 0; i < input1.length(); i++) {
            System.out.println(input1.charAt(i));
        }

        System.out.println("-------Exercise_3-------");

/* String Repetition
Description: Write a program that reads a string and an integer from the user, then prints the string repeated that many times. */

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a string ");

        String inputString = scanner.nextLine();
        System.out.println("Enter a integer ");

        int repeatCount = scanner.nextInt();

        for (int i = 0; i < repeatCount; i++) {
            System.out.print(inputString);

        }
    }
}
