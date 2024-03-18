package basics;

public class SumOfNumbersArray {
    public static void main(String[] args) {
        int [] A = {1,2,9,8,4};
        int x = 0;
        for (int i=0; i<A.length;i++){
            x=x+A[i];
        }
        System.out.println(x);
    }
}
