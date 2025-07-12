package leetcode;

import java.util.*;

public class topKfrequesntElement_347 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};int k=1;
        int res[]=getOutput(arr,k);
        System.out.println(res[0]+" "+res[1]);
    }

    private static int[] getOutput(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        int[] output=new int[res.size()];
        for(int i=0;i<res.size();i++){
            output[i]=res.get(i);
        }
        return output;
    }
}
