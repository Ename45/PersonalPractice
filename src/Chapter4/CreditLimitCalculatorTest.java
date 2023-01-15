package Chapter4;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator clc = new CreditLimitCalculator(0201246073, 500.0, 900.0, 400.0, 1000.0);
        System.out.println(clc.getBalance());


    }
}
