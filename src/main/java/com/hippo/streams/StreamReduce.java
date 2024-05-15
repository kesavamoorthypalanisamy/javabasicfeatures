package com.hippo.streams;

import java.util.Arrays;

public class StreamReduce {
    /*
     * Get sum of all the numbers in an array
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 4, 5, 5, 5, 5};
        int sum = Arrays.stream(a).reduce(0, (i, j) -> i + j);
        // int sum = Arrays.stream(a).reduce(0, Integer::sum); //Elegent way
        System.out.println(sum);

        /*
         * The Java stream API contains a set of predefined reduction operations, 
         * such as average(), sum(), min(), max(), and count()
         * But reduce() is general purpose
         */
        System.out.println(Arrays.stream(a).sum());
        System.out.println(Arrays.stream(a).count());
    }
}
