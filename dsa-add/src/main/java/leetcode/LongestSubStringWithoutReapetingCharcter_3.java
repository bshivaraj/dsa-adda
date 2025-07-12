package leetcode;

import java.util.HashSet;
import java.util.Objects;

public class LongestSubStringWithoutReapetingCharcter_3 {
    public static void main(String[] args) {
        String s="au";
        //bcdaefg
        System.out.println(getLongestSubString(s));
    }

    private static int getLongestSubString(String s) {
        if(Objects.equals(s, " ")){
            return 1;
        }
        String temp="",res="";
        HashSet<Character> set=new HashSet<>();
        char[] c=s.toCharArray();int i=0,j=0;
        while(i<c.length && j<c.length){
            if(set.add(c[j])){
                temp=temp+c[j];
                j++;
                if(temp.length()>res.length()){
                    res=temp;
                }
            }else{
                i++;
                j=i;
                set.clear();
                temp="";
            }
        }
        return res.length();
    }
}
