package com.hippo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {
    // Given a list of strings, concatenate them into a single string 
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", " ", "world", "!");
        System.out.println(list.stream().collect(Collectors.joining()));
    }
}
