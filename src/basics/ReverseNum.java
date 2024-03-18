package basics;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int rev = 0;
        while (number != 0) {
            int reminder = number % 10;
            rev = rev * 10 + reminder;
            number = number/10;
        }
        System.out.println("Reversed number is " + rev);
    }
}
