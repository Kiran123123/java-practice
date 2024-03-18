package basics;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] A = {30,90,70,80,20};
        int temp;
        for(int i=0;i<A.length;i++){
            for(int j=i+1; j<A.length; j++) {
                if (A[i] < A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println(A[0]);
    }
}
