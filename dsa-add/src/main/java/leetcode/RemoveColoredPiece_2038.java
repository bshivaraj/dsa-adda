package leetcode;

import java.util.*;

public class RemoveColoredPiece_2038 {
    public static void main(String[] args) {
        String colors="AAAAAAAAAAAABBBBBBBAAA";
        //ABBBBBBBAAA
        boolean res=getResultOfColor(colors);
        System.out.println(res);
    }

    private static boolean getResultOfColor(String colors) {
        if(colors.length()<=2){
            return false;
        }
        int countA=0,countB=0;
        for(int i=0;i<colors.length()-2;i++){
            if(colors.charAt(i+1)==colors.charAt(i) && colors.charAt(i+1)==colors.charAt(i+2)){
              if(colors.charAt(i+1)=='A'){
                  countA++;
              }else{
                  countB++;
              }
            }
        }
        if(countA>countB){
            return true;
        }
        return false;
    }
}
