package Linear_BinarySearch;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }

        System.out.println("String without duplicates: " + sb.toString());

        scanner.close();
    }
}
