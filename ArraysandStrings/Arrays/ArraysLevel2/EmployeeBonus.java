package ArraysandStrings.ArraysLevel2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] salary = new double[n];
        int[] years = new int[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            if (years[i] < 0) {
                System.out.println("Invalid years. Enter again.");
                i--;
                continue;
            }

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
