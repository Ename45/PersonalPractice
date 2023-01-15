package Chapter4;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int passedCounter = 0;
        int failedCounter = 0;

        while (counter <= 10){
            System.out.print("Enter result: ");
            int result = input.nextInt();

            if (result == 1){
                passedCounter++;}

            else {
                failedCounter++;
            }
            counter++;
        }

        System.out.println(passedCounter + " students passed the exam");
        System.out.println(failedCounter + " students failed the exam");

        if (passedCounter > 8){
            System.out.println("Bonus to instructor");
        }




//        Scanner input = new Scanner(System.in);
//
//        int total = 0;
//        int gradeCounter = 0;
//
//        System.out.println("Enter score or -1 to quit: ");
//        int score = input.nextInt();
//
//        while (score != -1){
//            total += score;
//            gradeCounter += 1;
//
//            System.out.println("Enter score or -1 to quit: ");
//            score = input.nextInt();
//        }
//
//        if (gradeCounter != 0){
//            double average = (double) total/gradeCounter;
//            System.out.println(gradeCounter +" " +total);
//            System.out.println(average);
//        }
//        else {
//            System.out.println("no grades entered");
//        }

//        Scanner input = new Scanner(System.in);
//
//        int total = 0;
//        int gradeCounter = 1;
//
//        while (gradeCounter <= 10){
//            System.out.println("Enter Score: ");
//            int score = input.nextInt();
//
//            if (score >= 0 && score <= 100){
//                total += score;
//                gradeCounter += 1;
//            }
//            else {
//                System.out.println("invalid score, input again");
//            }
//        }
//
//        double classAverage = (double)total/10;
//        System.out.println(total);
//        System.out.println(classAverage);


    }
}
