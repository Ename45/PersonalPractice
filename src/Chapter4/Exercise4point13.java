package Chapter4;

public class Exercise4point13 {
    public static void main(String[] args) {
//        int factorial = 1;
//        int x = 5;
//
//        while (x <= 5 && x > 0){
//            factorial = factorial * x;
//            --x;
//        }
//        System.out.println(factorial);

        int x = 7;
        int y = 3;

//        x += y++;
//        int value = (x + y);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(value);

        x += ++y;
        System.out.println(x);
        System.out.println(y);

    }
}
