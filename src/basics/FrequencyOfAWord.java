package basics;

public class FrequencyOfAWord {
    public static void main(String[] args) {

        String text = "Java is easy. The best programming language is Java.";
        text = text.replace("."," ");
        System.out.println(text);
        String[] words = text.split(" ");
        String find = "Java";
        int frequency = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equalsIgnoreCase(find)){
                frequency++;
            }
        }
        System.out.println("Frequency of \"" + find + "\" in the sentence: " + frequency);
    }
}
