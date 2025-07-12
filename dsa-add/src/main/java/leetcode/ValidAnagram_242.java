package leetcode;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s="anagram", t="nagaram";
        String m="rat", n="tan";

        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
      //  one more solution is by adding into hashmap
        if(s==null || t==null || (s.length()!=t.length())){
            return false;
        }
        char[] c1 =s.toCharArray();
        char[] c2=t.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         for(int i=0;i<s.length();i++){
             if(c1[i]!=c2[i]){
                 return  false;
             }
         }
        return true;
    }
}
