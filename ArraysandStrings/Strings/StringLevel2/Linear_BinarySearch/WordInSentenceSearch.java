package Linear_BinarySearch;
import java.util.Scanner;

public class WordInSentenceSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int numSentences = scanner.nextInt();
        scanner.nextLine();

        String[] sentences = new String[numSentences];
        System.out.println("Enter sentences:");
        for (int i = 0; i < numSentences; i++) {
            sentences[i] = scanner.nextLine();
        }

        System.out.print("Enter word to search: ");
        String targetWord = scanner.next();

        String result = "Not Found";
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(targetWord)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
