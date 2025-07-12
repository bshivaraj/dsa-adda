package leetcode;

import java.util.Arrays;

public class MoveNonZeroNumsEnd_283 {
    public static void main(String[] args) {
        int[] nums={1,0,2,3,0,0,4,0,5};
        moveZeros(nums);
        Arrays.stream(nums).forEach(x->System.out.println(x));
    }

    private static void moveZeros(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}


