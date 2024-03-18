package basics;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Malayalam";
        String pali = "";

        for (int i= name.length()-1; i>=0; i--){
            pali = pali + name.charAt(i);
        }

        name = name.toUpperCase();
        pali = pali.toUpperCase();

        if(pali.equals(name)){
            System.out.println("String is basics.Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
