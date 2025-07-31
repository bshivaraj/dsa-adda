package leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class circularArray_457 {
    public static void main(String[] args) {
        String s = "abcabd";
        s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);
// {false=[1, 3, 5], true=[2, 4]}


        s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        List<Integer> nums = Arrays.asList(10, 20, 5, 30);
        int max = nums.stream().max(Integer::compareTo).orElse(-1);
        int min = nums.stream().min(Integer::compare).orElse(-1);
        System.out.println(max);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );

        List<String> flat = listOfLists.stream()
                .flatMap(List::stream)
                .map(String::valueOf)
                .distinct()
                .limit(2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(flat);  // [a, b, c, d]

    }

}