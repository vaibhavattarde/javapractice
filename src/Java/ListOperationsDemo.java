package Java;

import  java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperationsDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // Adding
        myList.add("vaibhav");
        myList.add("attarde");
        myList.add("wayle");
        myList.add("nagar");

        // Display the original list
        System.out.println("Original List: " + myList);

        // Removing
        myList.remove(1);

        // Display the list
        System.out.println("List after removing an element: " + myList);
        boolean continsKalyan = myList.contains("Kalyan");
        System.out.println("List contains 'Kalyan ': " + continsKalyan);

        // Iterating
        System.out.print("Iterating through the list with for-each loop: ");
        for (String details : myList) {
            System.out.print(details + " ");
        }
        System.out.println();

        // Iterating
        System.out.print("Iterating through the list with Iterator: ");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Adding elements at a specific index
        myList.add(1, "dombivli");
        System.out.println("List after adding 'dombivli' at index 1: " + myList);

        // Clearing the entire list
        myList.clear();
        System.out.println("List after clearing: " + myList);
    }
}