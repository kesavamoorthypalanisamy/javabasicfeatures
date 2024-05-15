package com.hippo.streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToCharsProcessing {
    /*
     * find the first non-repeating character in a string
     */

    public static void main(String[] args) {
        String str = "abacdbef";
        Character firstCharacter = str.chars().mapToObj(s -> (char) s)
                // .peek(System.out::println)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                // .peek(i -> System.out.println(i))
                .filter(i -> i.getValue() == 1L).map(i -> i.getKey()).findFirst().get();
        System.out.println(firstCharacter);
    }
    
    
}
