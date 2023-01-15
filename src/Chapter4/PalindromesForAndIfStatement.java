package Chapter4;

import java.util.Scanner;

public class PalindromesForAndIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = scanner.nextInt();
        if (num < 10000 || num > 99999) {
            System.out.println("The number you entered is not a five-digit number.");
            return;
        }
        int temp = num;
        int reverse = 0;
        for (int i = 0; i < 5; i++) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        if (num == reverse) {
            System.out.println("The number you entered is a palindrome.");
        } else {
            System.out.println("The number you entered is not a palindrome.");
        }
    }
}
