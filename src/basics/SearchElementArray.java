package basics;

public class SearchElementArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Example array
        int searchElement = 90; // Element to search

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i;
                System.out.println("Element found at index " + index);
                break;
            }
            index++;
        }
        if (index == array.length) {
            System.out.println("Element not found in the array.");
        }
    }
}