package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] arr={"eat","Tea","ate", "abc", "Cab", "bca", "xyz"};
       /*        ["eat", "tea", "ate],
                 ["abc", "cab", "bca"],
                 ["xyz"]*/
        Map<String, List<String>> map=new HashMap<>();
        for(String s: arr){
            if(s!=null && !s.isEmpty()){
                char[] charArray=s.toCharArray();
                List<String> list = List.of();
                Arrays.sort(charArray);
                if (map.containsKey(Arrays.toString(charArray))) {
                    list = map.get(Arrays.toString(charArray));
                    list.add(s);
                    //map.get(Arrays.toString(charArray)).add(s);
                    map.put(Arrays.toString(charArray), list);
                } else {
                    list = new ArrayList<>();
                    list.add(s);
                    map.put(Arrays.toString(charArray), list);
                }

            }

        }

        for(String key:map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
