package leetcode;

import java.util.*;

public class Anagram_49 {
    public static void main(String[] args) {
        String[] stars= {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output=getAnagram(stars);
        System.out.println(output);
    }

    private static List<List<String>> getAnagram(String[] strs) {
       List<List<String>> res=new ArrayList<>();
       Map<String,List<String>> map=new HashMap<>();

       for(int i=0;i<strs.length;i++) {
           char[] c = strs[i].toCharArray();
           Arrays.sort(c);
           String key = String.valueOf(c);
           map.computeIfAbsent(key,k->new ArrayList<>()).add(strs[i]);
       }

       map.keySet().forEach(x->res.add(map.get(x)));
       return res;
    }

}
