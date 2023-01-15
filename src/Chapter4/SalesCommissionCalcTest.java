package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SalesCommissionCalc salesCommissionCalc = new SalesCommissionCalc();
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter amount sold");
            salesCommissionCalc.setTotalCommission(input.nextDouble());

        }
        System.out.printf("%.2f",salesCommissionCalc.getTotalCommission());


    }
}
