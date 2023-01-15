package Snack;


import java.util.Scanner;

public class StudentGrade {
    Scanner input = new Scanner(System.in);

    private int averageGrade;
    private int totalGrade;
    private int gradeCounter = 0;

    public void setTotalGrade(){
        int total = 0;
        System.out.println("Enter garde or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1){
        total += grade;
        gradeCounter++;

            System.out.println("Enter garde or -1 to quit: ");
            grade = input.nextInt();
        }
        totalGrade = total;
    }

    public int getTotalGrade(){
        return totalGrade;
    }

    public void setAverageGrade(){
        averageGrade = totalGrade/gradeCounter;
    }

    public int getAverageGrade(){
        return averageGrade;
    }
}
