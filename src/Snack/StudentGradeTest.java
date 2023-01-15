package Snack;


public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade sgc = new StudentGrade();

        sgc.setTotalGrade();
        System.out.println(sgc.getTotalGrade());
        sgc.setAverageGrade();
        System.out.println(sgc.getAverageGrade());

    }
}
