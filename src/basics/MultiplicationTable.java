package basics;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        System.out.println("The multiplication table of " + n + ":");

        for(int i=1; i<=10; i++) {
                System.out.println(n + " x " +i+" = " + n*i);
            }
        }
    }

