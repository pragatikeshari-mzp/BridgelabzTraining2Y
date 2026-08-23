package ArraysandStrings.ArraysLevel2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths marks: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 ||
                marks[i][1] < 0 ||
                marks[i][2] < 0) {

                System.out.println("Marks cannot be negative.");
                i--;
                continue;
            }

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
            else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n----- Results -----");

        for (int i = 0; i < n; i++) {

            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] +
                " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]
            );
        }

        sc.close();
    }
}
