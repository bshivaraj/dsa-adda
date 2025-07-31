package leetcode;

public class MaxConsecutiveOnes_1004 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int res=getoutput(nums,k);
        System.out.println(res);
    }

    private static int getoutput(int[] nums, int k) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j++] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[i++] == 0) {
                    k++;
                }
            }
        }
        return j - i;
    }
}
