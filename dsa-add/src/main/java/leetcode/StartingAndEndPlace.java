package leetcode;

import java.util.*;

public class StartingAndEndPlace {
    public static void main(String[] args) {
        Map<String, String> tickets = Map.of(
                "Chennai", "Bangalore",
                "Mumbai", "Delhi",
                "Goa", "Chennai",
                "Delhi", "Goa"
        );

        System.out.println(startAndEnd(tickets));

    }

    private static List<String> startAndEnd(Map<String, String> tickets) {
        List<String> list=new ArrayList<>();
        Set<String> destinations = new HashSet<>(tickets.values());

        // Step 2: Start point = source not present in destinations
        String start = null;
        for (String src : tickets.keySet()) {
            if (!destinations.contains(src)) {
                start = src;
                break;
            }
        }

        Set<String> keys=tickets.keySet();
        String end=null;
        for(String src:tickets.values()){
            if(!keys.contains(src)){
                end=src;
                break;
            }
        }
        list.add(start);
        list.add(end);
        return list;
    }
}
