package leetcode;

import java.util.*;

public class RemoveKthDigit_402 {
    public static void main(String[] args) {
        String tmp="14301620";int k=4;
        String res=getResultValue(tmp,k);
        System.out.println(res);
        Map map=new HashMap<>();
    }

    private static String getResultValue(String num,int k) {
        if (k == num.length()) return "0";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        // if still k left
        while (k > 0) {
            st.pop();
            k--;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        // remove leading zeroes
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
}
