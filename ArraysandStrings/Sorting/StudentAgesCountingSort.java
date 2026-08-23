package Sorting;

import java.util.Scanner;

public class StudentAgesCountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[] ages = new int[numStudents];
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < numStudents; i++) {
            ages[i] = scanner.nextInt();
        }

        int[] count = new int[21];
        for (int i = 0; i < numStudents; i++) {
            count[ages[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[numStudents];
        for (int i = numStudents - 1; i >= 0; i--) {
            output[count[ages[i]] - 1] = ages[i];
            count[ages[i]]--;
        }

        System.out.print("Sorted student ages: ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
