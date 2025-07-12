package leetcode;

public class RainWater_42 {
    public static void main(String[] args) {
       int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
       // int[] nums={3,1,2,4,0,1,3,2};
       int res=getWaterAmount(nums);
       System.out.println(res);
    }

    private static int getWaterAmount(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=nums[0];
        int[] right=new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        int result=0,size=nums.length-2;

        for(int i=1;i<nums.length;i++){
            left[i]=Math.max(left[i-1],nums[i]);
        }
        for(int i=size;i>=0;i--){
            right[i]=Math.max(right[i+1],nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            result=result+Math.min(left[i],right[i])-nums[i];
        }
        return result;
    }
}
