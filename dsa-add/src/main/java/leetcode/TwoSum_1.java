package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static <arr> void main(String[] args) {
        int[] arr ={2,7,11,15};int sum = 9;
        int[] res=getarraySum(arr,sum);
        System.out.println(Arrays.toString(res));
    }

    private static int[] getarraySum(int[] arr, int sum) {
        int[] output=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            var t=sum-arr[i];
            if(map.containsKey(t)){
                output[0]=i;
                output[1]=map.get(t);
            }else{
                map.put(arr[i],i);
            }
        }

        return output;
    }
}
