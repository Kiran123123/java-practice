package basics;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int number = 5;

        int factorial = calculateFactorial(number);

        System.out.println("basics.Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1); // Recursive case: n * factorial(n - 1)
        }
    }
}
