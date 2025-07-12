package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubString_1876 {
    public static void main(String[] args) {

        String s="aababcabc";

        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length() - 2; i++)
        {
            if (chars[i] != chars[i + 1]
                    && chars[i] != chars[i + 2]
                    && chars[i + 1] != chars[i + 2]
            ) result++;
        }
        System.out.println(result);

    }
}
