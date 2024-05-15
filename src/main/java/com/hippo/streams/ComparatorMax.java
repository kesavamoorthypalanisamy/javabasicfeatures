package com.hippo.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMax {
    /*
     * Find the longest string in a list of strings
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");
        String longestString = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(longestString);
    }
}
