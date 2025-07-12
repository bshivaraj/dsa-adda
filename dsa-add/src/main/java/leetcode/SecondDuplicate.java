package leetcode;

public class SecondDuplicate {
    public static void main(String[] args) {
        //String s="aabbccdeefgg";
        String s="abcdef";
        char res=getNonRepeatedChar(s);
        System.out.println(res);
    }

    private static char getNonRepeatedChar(String s) {
           int[] arr=new int[26];
           for(char ch:s.toCharArray()){
                arr[ch- 'a']++;
           }

          for(char ch:s.toCharArray()){
              if(arr[ch- 'a']==2){
                  return ch;
              }
          }

          return '_';
    }
}
