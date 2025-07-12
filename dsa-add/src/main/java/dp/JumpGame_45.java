package dp;

public class JumpGame_45 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
