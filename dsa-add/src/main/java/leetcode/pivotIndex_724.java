package leetcode;

import java.util.Arrays;

public class pivotIndex_724 {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
       // int[] arr1={-1,-1,-1,-1,-1,-1};
        int res=pivotIndex(arr);
        System.out.println(res);
    }
    private static int pivotIndex(int[] nums) {
        int t2=0,t1= Arrays.stream(nums).sum();

        for(int i=0;i<nums.length;i++){
            int tmp=(t1-nums[i])-t2;
            if(tmp==t2){
                return i;
            }
            t2=t2+nums[i];
        }
        return -1;
    }
}
