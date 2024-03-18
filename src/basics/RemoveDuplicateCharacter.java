package basics;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "hello";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is not already present in the result string
            if (result.indexOf(currentChar) == -1) {
                result += currentChar; // Append the character to the result string
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
