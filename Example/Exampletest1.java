package com.mphasis.Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exampletest1 {
    public static void main(String args[]) {

        LinkedList<String> result = new LinkedList<String>();

        // Add elements to the collection.
        result.add("B");
        result.add("C");
        result.add("D");
        result.add("X");
        result.add("Y");
        result.addFirst("Z");
        result.addLast("A");

        result.add(1, "A2");

        System.out.println("Original contents of result: " + result);

        // Remove elements from the collection.
        result.remove("F");
        result.remove(2);

        System.out.println("Contents of result after deletion: "
                + result);

        // Remove first and last elements.
        result.remove(0);
        result.remove(result.size()-1);

        System.out.println("result after deleting first and last: "
                + result);

        // Get and set a value.
        String val = result.get(2);
        result.set(2, val + " Changed");

        System.out.println("result after change: " + result);
    }

}
