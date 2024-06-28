package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ListSorting {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        // Another useful class in the java.util package
        // is the Collections class, which include the sort()
        // method for sorting lists alphabetically or numerically.

        names.add("bayo");
        names.add("timini");
        names.add("zubi");
        names.add("tom");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        // you can also reverse the order like this
        System.out.println("then the reverse");

        Collections.sort(names, Collections.reverseOrder());

        for (String name : names) {
            System.out.println(name);
        }
    }
}
