package Sorting;
import java.util.Scanner;

public class JobApplicantsHeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of applicants: ");
        int numApplicants = scanner.nextInt();

        double[] salaries = new double[numApplicants];
        System.out.println("Enter expected salaries:");
        for (int i = 0; i < numApplicants; i++) {
            salaries[i] = scanner.nextDouble();
        }

        heapSort(salaries);

        System.out.print("Sorted salaries: ");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void heapSort(double[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(double[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
