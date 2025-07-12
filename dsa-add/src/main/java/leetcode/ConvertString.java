package leetcode;

import java.util.HashMap;
import java.util.Map;


public class ConvertString {

    public static void main(String[] args) {
        String s="abcde";
        int k=2;
        String result=getResult(s,k);
        System.out.println(result);
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(0, (char) 4);
        System.out.println(sb);
    }

    private static String getResult(String str, int k) {
        int count=0,left=0,right=str.length()-1;
        StringBuilder sb=new StringBuilder(str);

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            int value=str.charAt(i)-'a';
            map.put(str.charAt(i),value+1);
        }
        while(count<=k){
            count++;
            if(count%2!=0){
                int value=map.get(str.charAt(left));
                sb.setCharAt(value-1,(char)value);
                left++;
            }else{
                int value=map.get(str.charAt(right));
                sb.setCharAt(value-1, (char) value);
                right--;
            }
        }
        return sb.toString();


    }
}
