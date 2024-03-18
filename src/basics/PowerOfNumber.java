package basics;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int base = scanner.nextInt();
        System.out.println("Enter the power ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;

        }
        System.out.println(result);

    }
}