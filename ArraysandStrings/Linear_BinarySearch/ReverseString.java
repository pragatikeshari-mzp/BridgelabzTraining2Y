package Linear_BinarySearch;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());

        scanner.close();
    }
}
