package Chapter3;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command = "Press 1 for book\nPress 2 for bags\nPress 3 for shoes";
        System.out.println(command);

        System.out.println("What do you want to buy: ");
        int num = input.nextInt();

        if (num == 1){
            String availableBooks = "Press i for Java How To Program \nPress ii for The Clean Coder\nPress iii for Software Engineering";
            System.out.println(availableBooks);

            System.out.println("Choose a book: ");
            String chooseBook = input.nextLine();


//            System.out.println("How many do you want to purchase: ");
//            int bookQty = input.nextInt();
        }





    }
}
