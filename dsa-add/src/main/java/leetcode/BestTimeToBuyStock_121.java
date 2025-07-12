package leetcode;

public class BestTimeToBuyStock_121 {

    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(getStockProfit(nums));
    }

    private static int getStockProfit(int[] nums) {
        int res=0,min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            if(nums[i]-min>res){
                res=nums[i]-min;
            }
        }
        return res;
    }
}
