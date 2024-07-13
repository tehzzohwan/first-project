package hash;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        /*
        Java HashMap
        In the ArrayList chapter, Arrays store items as an ordered collection,
        and you have to access them with an index number (int type). A HashMap however,
        store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

        One object is used as a key (index) to another object (value). It can store different types:
        String keys and Integer values, or the same type, like: String keys and String values:
        Example:
         */
        HashMap<String, String> fullName = new HashMap<String, String>();

        /*
        Add Items
        The HashMap class has many useful methods. For example, to add items to it, use the put() method:
         */
        fullName.put("Tehzz", "Ohwan");
        fullName.put("Bobby", "Enomate");

        /*
        Access an Item
        To access a value in the HashMap, use the get() method and refer to its key:
         */
        System.out.println(fullName.get("Tehzz"));

        /*
        Remove an Item
        To remove an item, use the remove() method and refer to the key:
         */
        fullName.remove("Tehzz");
        System.out.println(fullName.get("Tehzz"));

        /*
        To remove all items, use the clear() method:
         */
        fullName.clear();
        System.out.println(fullName.size());

    }
}
