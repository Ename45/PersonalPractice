package Chapter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase(String location, String petrolType, int quantity, double price, double discount){
        this.location = location;
        this.petrolType = petrolType;
        if (quantity >= 1) this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }

    public String getPetrolType(){
        return petrolType;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getDiscount(){
        discount = discount/100*(quantity*price);
        return discount;
    }

    public double getPurchaseAmount(){
        double netAmount = (quantity*price) - discount;
        return netAmount;
    }

}
