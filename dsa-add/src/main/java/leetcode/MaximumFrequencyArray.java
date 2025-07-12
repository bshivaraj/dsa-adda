package leetcode;

import java.util.*;

public class MaximumFrequencyArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,5,1,2,5,2,1};
        int res=maxFre(arr);
        System.out.println(res);
    }

    private static int maxFre(int[] arr) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int res=0,value=0;
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>value){
                value=map.get(key);
                res=key;
            }
        }
        int tmp=map.values().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).get();

        return res;
    }
}
