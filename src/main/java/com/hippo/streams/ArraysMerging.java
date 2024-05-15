package com.hippo.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class ArraysMerging {
    public static void main(String[] args) {
        /*
        * Merge all the arrays together
        */
       
        int[] a = {2, 3, 4, 4, 5, 5, 5, 5};
        int[] b = {3, 4, 5, 56, 77, 66};
        int[] c = {23, 45, 55, 66, 77};
        int[] d = {34, 45, 67, 88, 99};

        Integer[] allArrays = Stream.of(Arrays.stream(a).boxed(), Arrays.stream(b).boxed(),
                Arrays.stream(c).boxed(), Arrays.stream(d).boxed()).flatMap(Function.identity())
                .toArray(Integer[]::new);
        Arrays.stream(allArrays).forEach(System.out::print);
    }

}
