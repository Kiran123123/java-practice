package basics;

public class SumOfTheDigitsMethod {

    public static void main(String[] args) {
        int number = 12345;

        int sumOfDigits = calculateSum (number);

        System.out.println("sum of digits of "+ number + " is " + sumOfDigits);
    }

    public static int calculateSum (int number){
        int sum = 0;
        while (number !=0) {
            sum = sum+number%10;
            number = number/10;
        }
        return sum;

    }
}
