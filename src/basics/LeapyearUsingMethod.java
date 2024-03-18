package basics;

public class LeapyearUsingMethod {

    public static void main(String[] args) {

        int year = 2024;

        if(isleapyear(year)){
            System.out.println("is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }

    public static boolean isleapyear(int year){
        if((year%4==0 && year%100 != 0) || (year%4==0)){
            return true;
        }
        else{
            return false;
        }
    }
}

