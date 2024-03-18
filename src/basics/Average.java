package basics;

public class Average {
    public static void main(String[] args) {
        int[] number = {2,3};
        double avg;
        int sum = 0;

        for(int i=0; i<number.length; i++ ){
            sum = sum+number[i];
        }
        avg = (double) sum/number.length;
        System.out.println("average of given set of number is " + avg);
    }
}
