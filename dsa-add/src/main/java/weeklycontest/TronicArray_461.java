package weeklycontest;

import java.util.Stack;

public class TronicArray_461 {
    public static void main(String[] args) {
        int[]nums={6,8,2,5,9};
       /* int[]nums={1,3,5,4,2,6};
        int[]nums={1,3,5,4,2,6};
        int[]nums={1,3,5,4,2,6};
        int[]nums={1,3,5,4,2,6};*/
        System.out.println(isTronic(nums));
    }

    private static boolean isTronic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        // 1. Increasing phase
        while (i + 1 < n && nums[i] < nums[i + 1]) i++;
        if (i == 0 || i == n - 1) return false; // No peak or at end

        int p = i;

        // 2. Decreasing phase
        while (i + 1 < n && nums[i] > nums[i + 1]) i++;
        if (i == p || i == n - 1) return false; // No valley or at end

        int q = i;

        // 3. Increasing phase again
        while (i + 1 < n && nums[i] < nums[i + 1]) i++;

        return i == n - 1;
    }
}
