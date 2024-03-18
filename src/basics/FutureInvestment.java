package basics;

public class FutureInvestment {
    public static void main(String[] args) {

        int principle = 5000;
        int years = 10;
        double interest = 0.2;

        double returns = returnCalculator(principle,years,interest);
        System.out.println("Total value after "+years +" years is " + returns);

    }

    public static double returnCalculator(int principle, int years, double interest){
        double returns = principle * years * interest;
        return returns;
    }
}
