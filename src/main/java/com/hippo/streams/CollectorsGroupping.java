package com.hippo.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupping {
    /*
     * Count the occurrences of each word in a Array of strings
     */
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        List<String> wordsList = Arrays.asList(words);
        System.out.println(Arrays.stream(words).distinct()
                .collect(Collectors.toMap(Function.identity(), i -> Collections.frequency(wordsList, i))));
                
        // More elegant way using Collectors grouping
        System.out.println(Arrays.stream(words).distinct()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }

}
