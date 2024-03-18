package basics;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Dream big";
        String reverse = "";

        for(int i = string.length()-1; i >= 0; i--){
            reverse = reverse + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        System.out.println("Reverse of given string: " + reverse);
    }
}
