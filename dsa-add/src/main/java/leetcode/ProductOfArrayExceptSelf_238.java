package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(getData(nums)));
    }

    private static int[] getData(int[] nums) {
        int[] leftArr=new int[nums.length];
        int[] rightArr=new int[nums.length];
        int[] res=new int[nums.length];
        int left=1,right=1;
        for(int i=0;i<nums.length;i++){
              left=left*nums[i];
              leftArr[i]=left;
        }
        for(int i=nums.length-1;i>=0;i--){
             right=right*nums[i];
             rightArr[i]=right;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                res[i]= rightArr[i + 1];
            }
            else if(i==nums.length-1){
                res[i]=leftArr[nums.length-2];
            }
            else{
                res[i]=rightArr[i+1]*leftArr[i-1];
            }
        }
        return res;
    }
}
