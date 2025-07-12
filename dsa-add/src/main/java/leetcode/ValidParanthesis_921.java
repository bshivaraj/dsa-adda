package leetcode;

public class ValidParanthesis_921 {
    public static void main(String[] args) {
        String s="()))(";
        int res=getMimimum(s);
        System.out.println(res);
    }

    private static int getMimimum(String s) {
       int c1=0;
       int result=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                c1++;
            }else{
               c1--;
            }
            if(c1<0){
                c1=0;
                result++;
            }

        }

        result+=c1;

        return result;

    }
}
