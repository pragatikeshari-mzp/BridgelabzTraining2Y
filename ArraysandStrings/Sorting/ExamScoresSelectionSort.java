package Sorting;
import java.util.Scanner;

public class ExamScoresSelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        System.out.println("Enter exam scores:");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }

        System.out.print("Sorted exam scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

