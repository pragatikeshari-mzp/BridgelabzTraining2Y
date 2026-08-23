package Linear_BinarySearch;
public class PeakElement {
    public static int findPeakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean isGreaterThanLeft = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean isGreaterThanRight = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (isGreaterThanLeft && isGreaterThanRight) {
                return mid;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
