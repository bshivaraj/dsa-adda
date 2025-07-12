package leetcode;

import java.util.HashMap;

public class NumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums={4,1,3,3};
        //int[] nums={1,2,3,4,5};
        long res=getNumberOfPairs(nums);
        System.out.println(res);
    }

    private static long getNumberOfPairs(int[] nums) {
        long res=0;int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int key=j-nums[j];
            if(map.containsKey(key)){
                res=res+map.get(key);
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        long total= (long) n *(n-1);
        return total/2-res;
    }
}
