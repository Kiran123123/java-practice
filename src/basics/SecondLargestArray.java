package basics;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] array = {30, 90, 70, 80, 20}; // Example array

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }
}
