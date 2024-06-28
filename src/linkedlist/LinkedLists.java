package linkedlist;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedLists {
    public static void main(String[] args) {
        /*
        ArrayList vs. LinkedList
        The LinkedList class is a collection which can contain
        many objects of the same type, just like the ArrayList.
        */

        /*
        The LinkedList class has all of the same methods as the ArrayList
        class because they both implement the List interface.
        This means that you can add items, change items,
        remove items and clear the list in the same way.

        How the ArrayList works
        The ArrayList class has a regular array inside it. When an element is added,
        it is placed into the array. If the array is not big enough, a new, larger
        array is created to replace the old one and the old one is removed.

        How the LinkedList works
        The LinkedList stores its items in "containers." The list has a link to the
        first container and each container has a link to the next container in the list.
        To add an element to the list, the element is placed into a new container and
        that container is linked to one of the other containers in the list.

        LinkedList Methods
        For many cases, the ArrayList is more efficient as it is common to need
        access to random items in the list, but the LinkedList provides several
        methods to do certain operations more efficiently:
     */
        // .add()  --->  adds to the list
        LinkedList<String> games = new LinkedList<String>();
        games.add("asanam");
        System.out.println(games.get(0));

        // linked list has all the same methods as arraylist
        // and more which makes is the difference

        // addFirst()	-Adds an item to the beginning of the list
        games.addFirst("foli");
        System.out.println("first: " + games.getFirst());

        // addLast()	-Adds an item to the end of the list
        games.addLast("loli");
        System.out.println("last: " + games.getLast());

        // removeFirst()	-Remove an item from the beginning of the list
        System.out.println("old first: " + games.getFirst());
        games.removeFirst();
        System.out.println("new first: " + games.getFirst());

        // removeLast()	Remove an item from the end of the list
        System.out.println("old last: " + games.getLast());
        games.removeLast();
        System.out.println("new last: " + games.getLast());
    }




}
