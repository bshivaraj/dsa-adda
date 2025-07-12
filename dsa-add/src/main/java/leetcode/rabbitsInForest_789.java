package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class rabbitsInForest_789 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,3,3,3};
        int res=NumberOfrabbits(nums);
        System.out.println(res);
    }

    private static int NumberOfrabbits(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();int rabbits=0;
        for(int rabbit:nums){
            if(map.containsKey(rabbit)){
                int tmp=map.get(rabbit);
                tmp--;
                if(tmp==0){
                    map.remove(rabbit);
                }else{
                    map.put(rabbit,tmp);
                }
            }else{
                rabbits+=rabbit;
                rabbits++;
                if(rabbit!=0){
                    map.put(rabbit,rabbit);
                }
            }
        }
        return rabbits;
    }
}
