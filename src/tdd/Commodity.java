package tdd;

public class Commodity {
    private int price;
//    private String books;
//    private String bags;
//    private String shoes;

    public Commodity(String bookName, int bookPrice){

        price = bookPrice;
    }

    public Commodity(int bagPrice, String bagBrand){
        price = bagPrice;
    }

//    public Commodity(){
//        int shoeType;
//        int shoePrice;
//       // if ()
//
//    }

    public int getPrice() {
        return price;
    }

    public void setBooks(int bookQty) {
        price *= bookQty;
    }


    public void setBags(int bagQty) {
        price *= bagQty;
    }

}
