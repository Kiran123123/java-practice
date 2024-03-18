package basics;

public class AvgOfSetNumbersMethod {
    public static void main(String[] args) {
        double[] numbers = {10.5, 20.3, 30.8, 25.6, 15.2};

        double average = calculateAverage(numbers);

        System.out.println("Average of the numbers: " + average);
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
