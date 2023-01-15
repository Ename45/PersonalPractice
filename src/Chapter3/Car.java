package Chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    private double discount;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        if (price > 0) this.price = price;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setDiscount(double discount){
        this.discount = (discount/100)*price;
    }

    public void setDiscountPrice(double discount){
        price = price - this.discount;
    }

    public double getDiscount(){
        return discount;
    }


}
