package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollectionTest1 {
    public static void main(String args[]) {
        // Create a collection.
        Stack<String> adq = new Stack<String>();

        // Use the collection like a stack.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping the stack:: ");
        Iterator<String> it=adq.iterator();




        while(it.hasNext())
            System.out.print(adq.pop() + " ");

        System.out.println();
    }

}
