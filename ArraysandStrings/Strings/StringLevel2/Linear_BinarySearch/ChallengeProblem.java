package Linear_BinarySearch;
import java.util.Arrays;

public class ChallengeProblem {
    public static int findFirstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int n = nums.length;
        boolean[] visited = new boolean[n + 2];

        for (int num : nums) {
            if (num > 0 && num <= n + 1) {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return 1;
    }

    public static int findTargetIndex(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
