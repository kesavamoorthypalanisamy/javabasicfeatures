package com.hippo.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInCollection {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 4, 5, 5, 5, 5);
        //Find How many entris for 4 in the collection
        System.out.println("4 entries count: " + Collections.frequency(numbers, 4));

        System.out.println("Repeated elements in the collection");
        numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1)
                .forEach(System.out::println);

        //Map each count using ToMap feature
        Map<Integer, Integer> mapValues = numbers.stream().distinct()
                .collect(Collectors.toMap(Function.identity(), i -> Collections.frequency(numbers, i)));
        System.out.println(mapValues);
    }

}
