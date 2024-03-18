package basics;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        if(n%2==0) {
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
            }
    }
}
