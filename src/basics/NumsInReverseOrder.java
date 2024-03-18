package basics;

import java.util.Scanner;

public class NumsInReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        System.out.println("first "+n+" numbers in reverse order : ");

        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
