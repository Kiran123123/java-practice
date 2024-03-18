package basics;

public class primeNumber {

    public static void main(String[] args) {
        int number = 3;
        //int result;
        boolean prime = true;

        if (number<2){
            prime = false;
        }

        for (int i=2; i<number; i++){
            //int result = number%i;
            if (number%i == 0){
                prime = false;
                break;
            }
        }

        if (prime){
            System.out.println("Given number is a prime number");
        }else {
            System.out.println("Given number is not a prime number");
        }
    }
}
