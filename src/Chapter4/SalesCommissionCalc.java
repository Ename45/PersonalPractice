package Chapter4;

public class SalesCommissionCalc {
    private double amountSold;
    private final int FIXED_AMOUNT = 200;
    private final double FIXED_PERCENTAGE = 0.09;

    public void setTotalCommission(double amount){
        amountSold += amount;
    }
    public double getTotalCommission(){
        return amountSold * FIXED_PERCENTAGE + FIXED_AMOUNT;
    }

}
