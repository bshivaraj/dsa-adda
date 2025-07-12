package leetcode;

public class FindDuplicate_flyod_287 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int res=getDuplicateNum(nums);
        System.out.println(res);
    }

    private static int getDuplicateNum(int[] nums) {
        int i=0;
        while(true){
            int z = nums[i];  // Get the value at index i
            if (nums[z] == z)
                return z;  // If nums[z] is already at its correct position, return z
            nums[i] = nums[z];  // Move nums[z] to nums[i]
            nums[z] = z;  // Place z at its correct index
        }
    }
}
