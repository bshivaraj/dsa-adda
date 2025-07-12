package leetcode;

import java.util.Arrays;

public class NonZeroElementsAtLast {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        System.out.println(Arrays.toString(result(nums)));
    }

    private static int[] result(int[] nums) {
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return nums;

    }
}
