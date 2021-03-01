package com.mphasis.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);

      //  list.forEach(element -> System.out.println(element));

        list.stream()
                .map(element->element+2)
                .forEach(System.out::println);
    }
}
