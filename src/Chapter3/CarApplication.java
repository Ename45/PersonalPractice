package Chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car("RAV4 Toyota", "2014", 5_000_000);
        Car carTwo = new Car("Mercedes Benz", "2019", 15_000_000);

        /*System.out.printf("This is a %s, ", car.getModel());***/
        System.out.printf("%s model%n", car.getYear());
        System.out.printf("The car costs N%.0f%n", car.getPrice());
        car.setDiscount(5);
        System.out.printf("But with a 5 percent discount(N%.0f), ", car.getDiscount());
        car.setDiscountPrice(5);
        System.out.printf("you are to pay  N%.0f%n", car.getPrice());

        System.out.println();

        System.out.printf("This is a %s, ", carTwo.getModel());
        System.out.printf("%s model%n", carTwo.getYear());
        System.out.printf("The car costs N%.0f%n", carTwo.getPrice());
        carTwo.setDiscount(7);
        System.out.printf("But with a 7 percent discount(N%.0f), ", carTwo.getDiscount());
        carTwo.setDiscountPrice(7);
        System.out.printf("you are to pay N%.0f%n", carTwo.getPrice());


    }
}
