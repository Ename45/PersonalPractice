package Chapter3;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase pp = new PetrolPurchase("lagos", "diesel", 5, 65, 30);

        System.out.println(pp.getLocation());
        System.out.println(pp.getPetrolType());
        System.out.println(pp.getQuantity());
        System.out.println(pp.getPrice());
        System.out.println(pp.getDiscount());
        System.out.println(pp.getPurchaseAmount());

    }
}
