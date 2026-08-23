package Linear_BinarySearch;
public class FirstAndLastOccurrence {
    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = {-1, -1};
        if (arr == null || arr.length == 0) {
            return result;
        }

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;
    }

    private static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    private static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
