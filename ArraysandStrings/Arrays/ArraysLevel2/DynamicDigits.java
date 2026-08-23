package ArraysandStrings.ArraysLevel2;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;
        int temp = number;

        while (temp != 0) {

            if (index == maxDigit) {

                maxDigit += 10;

                int[] tempArray = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }

                digits = tempArray;
            }

            digits[index] = temp % 10;
            temp /= 10;

            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest &&
                     digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}