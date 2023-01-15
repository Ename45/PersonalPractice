package Chapter4;

public class Exercise4pt14 {

        public static void main(String[] args) {

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

