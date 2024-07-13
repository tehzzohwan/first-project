package hash;

import java.util.HashSet;
import java.util.Optional;

public class HashSets {
    // A HashSet is a collection of items where every item is unique,
    // and it is found in the java.util package:
    public static void main(String[] args) {
        // Create a HashSet object called emails that will store strings:
        HashSet<String> emails = new HashSet<String>();

        // Add Items
        emails.add("boom@gmail.com");
        emails.add("anjo@gmail.com");
        emails.add("oli@gmail.com");
        emails.add("boom@gmail.com");
        emails.add("sumbo@gmail.com");
        System.out.println(emails);

//        emails.stream().filter(name -> name.equals("sumbo@gmail.com"));
//        String firstMatch = emails.stream().findFirst().orElse("alt");
//        System.out.println("firstMatch: " + firstMatch);


        // Check If an Item Exists
        System.out.println("ola:" + emails.contains("ola@gmail.com"));
        System.out.println("oli:" + emails.contains("oli@gmail.com"));

        //Remove an Item
        System.out.println(emails.remove("Volvo"));
        System.out.println(emails.remove("anjo@gmail.com"));
        System.out.println(emails);

        //To remove all items, use the clear() method:
        emails.clear();
        System.out.println(emails);

        // HashSet Size
        // To find out how many items there are, use the size method:
        System.out.println(emails.size());

        // Other Types
        //Items in an HashSet are actually objects. In the examples above,
        // we created items (objects) of type "String". Remember that a String
        // in Java is an object (not a primitive type). To use other types,
        // such as int, you must specify an equivalent wrapper class: Integer.
        // For other primitive types, use:
        // Boolean for boolean, Character for char, Double for double, etc:

    }
}
