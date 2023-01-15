package Chapter4;

import java.util.Scanner;

public class Pattern {
    Scanner input = new Scanner(System.in);
    int num;

    public void userPrompt(){
        System.out.println("Enter a number: ");
        num = input.nextInt();
    }

    public void pattern1(){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern2() {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern3() {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern4() {
        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= num-row; spaces++) {
                System.out.print("  ");
            }
            //int totalColumnsInRow = 45;
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern5() {
        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= row -1; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= num+1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(){
        for (int row = 0; row <= 2*num; row++) {
            int totalColsInRow = row>num ? 2*num-row : row;
            for (int col = 0; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
