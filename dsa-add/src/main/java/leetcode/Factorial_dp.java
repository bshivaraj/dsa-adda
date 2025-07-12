package leetcode;

public class Factorial_dp {
    public static void main(String[] args) {
        int n=9999;
        System.out.println(System.currentTimeMillis());
        int res=factorial(n);
        System.out.println(System.currentTimeMillis());
        System.out.println(res);
    }

    private static int factorial(int n) {
        int[] nums=new int[256];
        if(n==0 || n==1){
            return 1;
        }
       // nums[n]
        return n*factorial(n-1);
    }
}
