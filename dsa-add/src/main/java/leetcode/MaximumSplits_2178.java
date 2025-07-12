package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaximumSplits_2178 {
    public static void main(String[] args) {
        int sum=16;
        System.out.println(maximumSplit(sum));
    }

    private static List<Long> maximumSplit(int sum) {
        List<Long> result=new ArrayList<>();

        if(sum%2!=0)
            return result;

        long cur=2;
        while(sum>=cur){
            result.add(cur);
            sum-=cur;
            cur+=2;
        }
        if(sum>0){
            long last=result.remove(result.size()-1);
            result.add(last+sum);
        }
        return result;
    }
}
