import java.util.Scanner;

class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("You've entered " + wordCount + " words.");
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
