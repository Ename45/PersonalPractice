package Chapter4;

import java.util.Scanner;

public class PalindromesDigitAndIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = scanner.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("The number you entered is not a five-digit number.");
        }

        int firstDigit = num / 10000;
        int secondDigit = (num / 1000) % 10;
        int thirdDigit = (num / 100) % 10;
        int fourthDigit = (num / 10) % 10;
        int fifthDigit = num % 10;

        if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
            System.out.println("The number you entered is a palindrome.");
        } else {
            System.out.println("The number you entered is not a palindrome.");
        }

    }
}
