package Sorting;

import java.util.Scanner;

public class StudentMarksBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents];
        System.out.println("Enter student marks:");
        for (int i = 0; i < numStudents; i++) {
            marks[i] = scanner.nextInt();
        }

        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
