package leetcode;

import java.util.Stack;

public class Remove_SubString_2696 {
    public static void main(String[] args) {
        String s="ABFCACDB";
       // System.out.println(s.substring(2,5));
        int size=getTrimmedString(s);
        System.out.println(size);
    }

    /*@Author Shiva*/
    private static int getTrimmedString(String s) {
      if(s==null|| s.isEmpty()){
          return 0;
      }
      Stack<Character> stack = new Stack<>();
      char[] chars = s.toCharArray();
      for (int i = 0; i < chars.length; i++) {
          if(!stack.isEmpty() &&
                  ((stack.peek()== 'A' && chars[i] == 'B') || (stack.peek()== 'C' && chars[i] == 'D') ) ){
             stack.pop();
          }else{
            stack.push(chars[i]);
        }
      }
      return stack.size();
    }
}
