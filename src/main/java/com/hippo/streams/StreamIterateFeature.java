package com.hippo.streams;

import java.util.stream.Stream;

public class StreamIterateFeature {
    /*
     * Stream.iterate method is used for creating infinite streams of sequences.
     * It takes seed value and unary function that applies the function to the previous element.
     */
    public static void main(String[] args) {
        Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);
    }

}
