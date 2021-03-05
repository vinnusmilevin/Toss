package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionTest3 {
    public static void main(String args[]) {

        // Use a data structure.
        HashMap<String, Float> hm = new HashMap<String, Float>();

        // Place elements to the data structure
        hm.put("John Doe", new Float(3434.34));
        hm.put("Tom Smith", new Float(123.22));
        hm.put("Jane Baker", new Float(1378.00));
        hm.put("Tod Hall", new Float(99.22));
        hm.put("Ralph Smith", new Float(-19.08));

        // Get a set of the entries.
        Set<Map.Entry<String, Float>> set = hm.entrySet();

        // Display the set.
        for(Map.Entry<String, Float> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposit 1000 into John Doe's account.
        Float balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " +
                hm.get("John Doe"));
    }

}
