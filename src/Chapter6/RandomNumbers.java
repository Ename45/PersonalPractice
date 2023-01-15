package Chapter6;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 1; i == 1; i++) {
            int number = 1 + secureRandom.nextInt(10);
            System.out.printf("%dst random number = %d%n", i, number);
        }

        for (int i = 2; i == 2; i++) {
            int number = 1 + secureRandom.nextInt(10);
            System.out.printf("%dnd random number = %d%n", i, number);
        }

        for (int i = 3; i == 3; i++) {
            int number = 1 + secureRandom.nextInt(10);
            System.out.printf("%drd random number = %d%n", i, number);
        }

        for (int i = 4; i <= 10; i++) {
            int number = 1 + secureRandom.nextInt(10);
            System.out.printf("%dth random number = %d%n", i, number);
        }
    }
}
