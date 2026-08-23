package ArraysandStrings.ArraysLevel2;

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            if (weight <= 0) {
                System.out.println("Enter positive weight.");
                i--;
                continue;
            }

            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();

            if (height <= 0) {
                System.out.println("Enter positive height.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            personData[i][2] =
                    weight / (height * height);

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n----- BMI Details -----");

        for (int i = 0; i < number; i++) {

            System.out.println(
                "Person " + (i + 1) +
                " | Weight: " + personData[i][0] +
                " | Height: " + personData[i][1] +
                " | BMI: " + personData[i][2] +
                " | Status: " + weightStatus[i]
            );
        }

        sc.close();
    }
}
