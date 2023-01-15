package Chapter4;

import java.util.Scanner;

public class GasMileage4pt17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to end): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this tank: %.2f%n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;
        }

        if (totalGallons > 0) {
            double combinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n", combinedMilesPerGallon);
        } else {
            System.out.println("No miles have been entered.");
        }

//
//        // Sentinel value to control the loop
//        int miles = -1;
//
//        // Variables to keep track of the total miles and gallons
//        int totalMiles = 0;
//        int totalGallons = 0;
//
//        // Loop until the user inputs a negative number for the miles
//        while (miles >= 0) {
//            System.out.print("Enter the number of miles driven: ");
//            miles = input.nextInt();
//
//            // If the user inputs a negative number, exit the loop
//            if (miles < 0) {
//                break;
//            }
//
//            System.out.print("Enter the number of gallons used: ");
//            int gallons = input.nextInt();
//
//            // Calculate and print the miles per gallon for this trip
//            double milesPerGallon = (double) miles / (double) gallons;
//            System.out.println("Miles per gallon for this trip: " + milesPerGallon);
//
//            // Add the miles and gallons for this trip to the total
//            totalMiles += miles;
//            totalGallons += gallons;
//        }
//
//        // Calculate and print the combined miles per gallon for all trips
//        double combinedMilesPerGallon = (double) totalMiles / (double) totalGallons;
//        System.out.println("Combined miles per gallon for all trips: " + combinedMilesPerGallon);
    }

}
