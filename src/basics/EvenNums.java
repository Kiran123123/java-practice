package basics;

import java.util.Scanner;

public class EvenNums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        for(int i=2; i<=n; i += 2){
                System.out.println(i);
            }
        }
    }
