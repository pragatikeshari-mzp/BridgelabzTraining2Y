package Sorting;

import java.util.Scanner;

public class EmployeeIDsInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();

        int[] employeeIDs = new int[numEmployees];
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < numEmployees; i++) {
            employeeIDs[i] = scanner.nextInt();
        }

        int n = employeeIDs.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }
            employeeIDs[j + 1] = key;
        }

        System.out.print("Sorted employee IDs: ");
        for (int i = 0; i < employeeIDs.length; i++) {
            System.out.print(employeeIDs[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

