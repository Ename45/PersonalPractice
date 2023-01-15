package Chapter4;

import java.util.Scanner;

public class PalindromesConvertToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = scanner.nextInt();
        if (num < 10000 || num > 99999) {
            System.out.println("The number you entered is not a five-digit number.");
        }


        String input = Integer.toString(num);
        String reverse = new StringBuilder(input).reverse().toString();


        //OR  if (input.matches(reverse))
        if (input.equals(reverse)) {
            System.out.println("The number you entered is a palindrome.");
        } else {
            System.out.println("The number you entered is not a palindrome.");
        }

//            System.out.println(palindrome(12321));
//            System.out.println(palindrome(45554));
//            System.out.println(palindrome(55555));
//            System.out.println(palindrome(12345));
//            System.out.println(palindrome(11611));
//        }
//
//        public static boolean palindrome(int num)
//        {
//            String sNum = String.valueOf(num);
//
//            int length = sNum.length();
//            if (length>5)
//            {
//                return false;
//            }
//
//            // 12321
//            for (int i = 0; i< length; i++)
//            {
//                if (sNum.charAt(i) != sNum.charAt((length-1)-i) )
//                {
//                    return false;
//                }
//            }
//            return true;
        }

    }

