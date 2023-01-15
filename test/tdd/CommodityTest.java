package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommodityTest {
    @Test
    public void priceOfBooks(){
        //I have a book with price 1000 naira;
        Commodity bp = new Commodity("Java How To Program", 1000);
        //when a user chooses to buy the book and quantity;
        bp.setBooks(5);
        //check that price calculates;
        int price = bp.getPrice();
        assertEquals(5000, price);
    }

    @Test
    public void priceOfBags(){
        //I have a bag with price 1000 naira;
        Commodity bgp = new Commodity(8000, "louis Vuitton");
        Commodity bgp2 = new Commodity(5000, "Gucci");
        //when a user chooses to buy the book and quantity;
        bgp.setBags(2);
        bgp2.setBags(1);
        //check that price calculates;
        int price = bgp.getPrice();
        int price2 = bgp2.getPrice();
        assertEquals(16000, price);
        assertEquals(5000, price2);
    }

    @Test
    public void priceOfShoes(){
        //I have a shoe with price 2500 naira;
        Commodity bgp = new Commodity(8000, "louis Vuitton");
        Commodity bgp2 = new Commodity(5000, "Gucci");
        //when a user chooses to buy the book and quantity;
        bgp.setBags(2);
        bgp2.setBags(1);
        //check that price calculates;
        int price = bgp.getPrice();
        int price2 = bgp2.getPrice();
        assertEquals(16000, price);
        assertEquals(5000, price2);
    }
}
