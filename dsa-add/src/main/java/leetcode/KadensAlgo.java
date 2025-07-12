package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KadensAlgo {
    public static void main(String[] args) {
        int[] nums={-5,4,6,-3,4,-1};
        int res=getSubSum(nums);
        System.out.println(res);
    }

    private static int getSubSum(int[] nums) {
        int sum=0,res=0;
        if(nums.length==0){
            return sum;
        }
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            res=Math.max(res,sum);
        }

        return res;
    }
}
