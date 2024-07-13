import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    // An Iterator is an object that can be used to loop through collections,
    // like ArrayList and HashSet. It is called an "iterator"
    // because "iterating" is the technical term for looping.

    // To use an Iterator, you must import it from the java.util package.

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Volvo");
        names.add("BMW");
        names.add("Ford");
        names.add("Mazda");

        // Getting an Iterator
        // The iterator() method can be used to get an Iterator for any collection:

        Iterator<String> iterate = names.iterator();

        // Print the first item
        System.out.println(iterate.next());
    }
}
