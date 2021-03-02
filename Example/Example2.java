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
        System.out.println("2nd example===================");
        list.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        System.out.println("3nd example===================");

        System.out.println( list.stream()
                .reduce(0,(total,e)->Integer.sum(total,e)));

        System.out.println("4nd example===================");

        System.out.println( list.stream()
                .map(e->String.valueOf(e))
                .reduce((concatstring,str)->concatstring.concat(str)));

        System.out.println("5nd example===================");

        System.out.println( list.stream()
                        .map(e->String.valueOf(e))
                .reduce("",String::concat));

    }
}
