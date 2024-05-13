package com.hippo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamFilterNulls {
    /*
     * Stream.ofNullable will produce empty stream if null value was passed.
     * So flatmapping it will give no-null results
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("abc", "bca", null, null, "xyz");
        System.out.println(names);
        names.stream().flatMap(s -> Stream.ofNullable(s)).forEach(System.out::println);
        
        //ANother approch to filter nulls
        names.stream().filter(s -> Objects.nonNull(s)).forEach(System.out::println);

    }

}
