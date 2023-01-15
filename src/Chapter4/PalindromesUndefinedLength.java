package Chapter4;

import java.util.Scanner;

public class PalindromesUndefinedLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String input = Integer.toString(num);
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println("The number you entered is a palindrome.");
        } else {
            System.out.println("The number you entered is not a palindrome.");
        }
    }
}
