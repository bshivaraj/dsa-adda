package dp;

import java.util.HashMap;

public class FibanocciNumber {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int n=999;
        System.out.println( feb(n));
    }
    private static int feb(int n) {

       if (n==0) return 0;
       if (n==1) return 1;
       if(memo.containsKey(n)){
           return memo.get(n);
       }
       int res=feb(n-1)+feb(n-2);
        memo.put(n,res);
       return res;
    }
}
