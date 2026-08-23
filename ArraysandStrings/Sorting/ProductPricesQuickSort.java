package Sorting;

import java.util.Scanner;

public class ProductPricesQuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numProducts = scanner.nextInt();

        double[] prices = new double[numProducts];
        System.out.println("Enter product prices:");
        for (int i = 0; i < numProducts; i++) {
            prices[i] = scanner.nextDouble();
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.print("Sorted product prices: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
