package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeWays_91 {
    public static void main(String[] args) {
        String num="222";
        int res=getNumberOfWays(num);
        System.out.println(res);
    }

    private static int getNumberOfWays(String num) {
        int result=0;int size=num.length();
        while(size>0){
         if(Integer.valueOf(num.substring(0,1)) >26){

         }

        }
        return result;
    }
}
