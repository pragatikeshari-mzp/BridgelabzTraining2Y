package Linear_BinarySearch;
import java.util.Scanner;

public class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int targetIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                targetIndex = i;
                break;
            }
        }

        System.out.println("Result index: " + targetIndex);

        scanner.close();
    }
}
