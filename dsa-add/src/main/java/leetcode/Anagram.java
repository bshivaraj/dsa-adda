package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        String s1="geeks",s2="kseeg";
        boolean res=isStringAnagram(s1,s2);
        System.out.println(res);
    }

    private static boolean isStringAnagram(String s1, String s2) {
        if(s1==null || s2==null ||(s1.length()!=s2.length())){
            return false;
        }
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
