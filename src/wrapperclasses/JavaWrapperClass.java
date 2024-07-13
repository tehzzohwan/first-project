package wrapperclasses;

import java.util.ArrayList;

public class JavaWrapperClass {
    // Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    /*
    the primitive type and the equivalent wrapper class:
    byte --Byte
    short --Short
    int	--Integer
    long --Long
    float --Float
    double --Double
    boolean	--Boolean
    char --Character


    Sometimes you must use wrapper classes, for example when working with Collection objects,
    such as ArrayList, where primitive types cannot be used (the list can only store objects):
     */

    public static void main(String[] args) {
        // this won't work ArrayList<int> myNumbers = new ArrayList<int>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        Integer typeInt = 5;
        Double typeDouble = 5.99;
        Character typeChar = 'A';
        System.out.println(typeInt);
        System.out.println(typeDouble);
        System.out.println(typeChar);

        /*
        the following methods are used to get the value associated
        with the corresponding wrapper object:
        intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
         */

        Integer secondInt = 20;
        Double secondDouble = 90.01;
        Character secondChar = 'd';
        System.out.println("secondInt: " + secondInt.intValue());
        System.out.println("secondDouble: " + secondDouble.doubleValue());
        System.out.println("secondChar: " + secondChar.charValue());

        /*
        Another useful method is the toString() method, which is used to convert wrapper objects to strings.
         */
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println("myStringLength: " + myString.length());
    }
}
