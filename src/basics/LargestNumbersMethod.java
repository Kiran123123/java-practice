package basics;

public class LargestNumbersMethod {

    public static void main(String[] args) {
        int[] numbers = {50,20,40,10,60,30};

        int largest = findlargest(numbers);
        System.out.println("largest number is " + largest);
    }

    public static int findlargest (int[] numbers) {
        int largest = numbers[0];

        for (int i=0; i<numbers.length ;i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }

        }
        return largest;


    }

}
