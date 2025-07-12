package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=123;int res=0;
        int result=extracted(num, res);
        System.out.println(result);
    }

    private static int extracted(int num, int res) {
        while(num !=0){
            int rem= num %10;
            res = res *10+rem;
            num = num /10;
        }
        return res;
    }
}
