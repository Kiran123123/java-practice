package basics;

public class SwapNumbers {

    public static void main(String[] args) {
        int A = 17;
        int B = 22;

        A = B - A; // 5
        B = B - A; // 17
        A = A + B; // 22

        System.out.println("Value of A = " + A);
        System.out.println("Value of B = " + B);
    }
}
