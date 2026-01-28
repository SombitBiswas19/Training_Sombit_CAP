package collection_framework;

import java.util.*;

public class Implementation_of_HashSet {

    /* =========================================================
       HASHSET IMPLEMENTATION
       - No insertion order
       - Allows one null
       - No duplicates
       ========================================================= */
    public static void Hashset_Implementation() {

        System.out.println("========== HASHSET IMPLEMENTATION ==========");

        // Creating HashSet (raw type avoided, using Object)
        HashSet<Object> set = new HashSet<>();

        // Add elements (Create operation)
        System.out.println("Adding elements to HashSet...");
        set.add("Java");     // String
        set.add(88);         // Integer
        set.add("C++");      // String
        set.add("C++");      // Duplicate (will be ignored)
        set.add(null);       // One null allowed

        // Printing HashSet
        System.out.println("HashSet elements: " + set);

        // Read operation
        System.out.println("Contains 'Java'? : " + set.contains("Java"));

        // Delete operation
        System.out.println("Removing 'C++' from HashSet...");
        set.remove("C++");

        // Printing updated HashSet
        System.out.println("Updated HashSet: " + set);

        // Size of HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Check if empty
        System.out.println("Is HashSet empty? : " + set.isEmpty());

        // Clear all elements
        System.out.println("Clearing HashSet...");
        set.clear();
        System.out.println("HashSet after clear(): " + set);
    }

    /* =========================================================
       LINKEDHASHSET IMPLEMENTATION
       - Maintains insertion order
       - Allows one null
       - No duplicates
       - Java 21+: SequencedSet methods supported
       ========================================================= */
    public static void LinkedHashset_Implementation() {

        System.out.println("========== LINKEDHASHSET IMPLEMENTATION ==========");

        // Creating LinkedHashSet
        LinkedHashSet<Object> set1 = new LinkedHashSet<>();

        // Add elements
        System.out.println("Adding elements to LinkedHashSet...");
        set1.add("Java");
        set1.add(88);
        set1.add("C++");
        set1.add("C++"); // Duplicate ignored
        set1.add(null);

        // Print elements (in insertion order)
        System.out.println("LinkedHashSet elements: " + set1);

        // Read operation
        System.out.println("Contains 'Java'? : " + set1.contains("Java"));

        // Delete operation
        System.out.println("Removing 'C++'...");
        set1.remove("C++");
        System.out.println("After remove: " + set1);

        // Java 21 - add element at beginning
        System.out.println("Adding element at first position...");
        set1.addFirst("First");
        System.out.println(set1);

        // Java 21 - add element at end
        System.out.println("Adding element at last position...");
        set1.addLast("Last");
        System.out.println(set1);

        // Get first and last elements
        System.out.println("First element: " + set1.getFirst());
        System.out.println("Last element: " + set1.getLast());

        // Remove first and last elements
        System.out.println("removeFirst(): " + set1.removeFirst());
        System.out.println("removeLast(): " + set1.removeLast());
        System.out.println("After removals: " + set1);

        // Reversed view
        System.out.println("Reversed LinkedHashSet view: " + set1.reversed());
    }

    /* =========================================================
       TREESET IMPLEMENTATION
       - Sorted Set
       - Does NOT allow null
       - Homogeneous elements only
       ========================================================= */
    public static void Treeset_Implementation() {

        System.out.println("========== TREESET IMPLEMENTATION ==========");

        // Creating TreeSet of String (Sorted order)
        TreeSet<String> set3 = new TreeSet<>();

        // Add elements
        System.out.println("Adding elements to TreeSet...");
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");

        // TreeSet automatically sorts elements
        System.out.println("TreeSet elements (Sorted): " + set3);

        // Java 21 - Add elements at first and last
        System.out.println("Adding elements using addFirst & addLast...");
        /* TreeSet is a sorted set, so: Elements must be placed according to sorting order
           You cannot force an element to the first or last position
           Therefore: ❌ are unsupported → throw UnsupportedOperationException*/
        //set3.addFirst("Ami");
        //set3.addLast("Tui");
        System.out.println(set3);

        // Navigational methods
        //Returns the least element in this set greater than or equal 
        //to the given element, or null if there is no such element.
        System.out.println("ceiling(\"L\"): " + set3.ceiling("L"));
        //Returns the greatest element in this set less than or equal 
        //to the given element, or null if there is no such element.
        System.out.println("floor(\"Z\"): " + set3.floor("Z"));
        //Returns the least element in this set strictly greater than 
        //the given element, or null if there is no such element.
        System.out.println("higher(\"Java\"): " + set3.higher("Java"));
        //Returns the greatest element in this set strictly less than the given element,
        //or null if there is no such element.
        System.out.println("lower(\"Java\"): " + set3.lower("Java"));

        // First and last elements
        System.out.println("First element: " + set3.first());
        System.out.println("Last element: " + set3.last());

        // Subset operations
        System.out.println("headSet(\"Python\"): " + set3.headSet("Python"));
        System.out.println("tailSet(\"Java\"): " + set3.tailSet("Java"));
        System.out.println("subSet(\"C++\", \"Python\"): " + set3.subSet("C++", "Python"));

        // Poll operations
        System.out.println("pollFirst(): " + set3.pollFirst());
        System.out.println("pollLast(): " + set3.pollLast());
        System.out.println("After polling: " + set3);

        // Remove element
        System.out.println("Removing 'Java'...");
        set3.remove("Java");
        System.out.println("After remove: " + set3);

        // Reversed view
        System.out.println("Reversed TreeSet view: " + set3.reversed());

        // Size
        System.out.println("TreeSet size: " + set3.size());
    }

    /* =========================================================
       MAIN METHOD
       ========================================================= */
    public static void main(String[] args) {

        Hashset_Implementation();
        System.out.println("-----------------------------------");

        LinkedHashset_Implementation();
        System.out.println("-----------------------------------");

        Treeset_Implementation();
        System.out.println("-----------------------------------");

        // ArrayList to HashSet conversion example
        System.out.println("========== ARRAYLIST → HASHSET ==========");

        ArrayList<Integer> al = new ArrayList<>();
        al.add(50);
        al.add(50);
        al.add(10);

        System.out.println("ArrayList (allows duplicates): " + al);

        HashSet<Integer> set4 = new HashSet<>(al);
        System.out.println("HashSet (duplicates removed): " + set4);
    }
}
