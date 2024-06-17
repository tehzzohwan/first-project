package method;

public class Method {
    String methodName = "";

    /*
    Java Constructors
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes:
     */
    public Method(String name) {
        methodName = name;
    }
    /*
    Modifiers
    The public keyword is an access modifier,
    meaning that it is used to set the access level for classes, attributes, methods and constructors.
    We divide modifiers into two groups:
    Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality
     */
    public static void main(String[] args) {
        // a method can be called multiple times

        Method jelo = new Method("Jelo");
        System.out.println(jelo.methodName);

        myMethod();
        myMethod();

        firstName("Bobby");
        firstName("Laura");
        firstName("Collins");

        checkAge(18);
        System.out.println(returnMethod(8, 4));

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        int result = sum(10);
        System.out.println(result);
    }

    /*
    A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
    Why use methods? To reuse code: define the code once, and use it many times.
     */

    private static void myMethod() {
        System.out.println("this is my new method");
    }

    // Method Parameters and Argument

    /*
    Information can be passed to methods as parameter.
    Parameters act as variables inside the method.
    Parameters are specified after the method name,
    inside the parentheses. You can add as many parameters
    as you want, just separate them with a comma.
     */

    private static void firstName(String fName) {
        System.out.println(fName + " Enomate");
        /*
        When a parameter is passed to the method, it is called an argument.
        So, from the example above: fName is a parameter,
        while Bobby, Laura and Collins are arguments.
         */
    }

    private static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    private static int returnMethod(int x, int y) {
        return y * x;
    }

    /*
    Method Overloading
    With method overloading, multiple methods can have the same name with different parameters:
     */

    private static int plusMethod(int x, int y) {
        return x + y;
    }

    private static double plusMethod(double x, double y) {
        return x + y;
    }

    // Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

    /*
    Java scope

    In Java, variables are only accessible inside the region they are created. This is called scope.

    Method Scope
    Variables declared directly inside a method are available anywhere in the method
    following the line of code in which they were declared:
     */

    private static void methodScope() {
        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
        // variables can only be used after they've been declared i.e only code after the declared variable can use it.
    }

    /*
    Block Scope
    A block of code refers to all of the code between curly braces {}.
    Variables declared inside blocks of code are only accessible by the
    code between the curly braces, which follows the line in which the variable was declared:
     */

    private static void blockScope() {
        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    }

    /*
    Java Recursion
    Recursion is the technique of making a function call itself.
    This technique provides a way to break complicated problems down
    into simple problems which are easier to solve.
     */

    private static int sum(int k) {
        if (k > 0) { // (k > 0) halting condition
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Halting Condition
    //Just as loops can run into the problem of infinite looping,
    // recursive functions can run into the problem of infinite recursion.
    // Infinite recursion is when the function never stops calling itself.
    // Every recursive function should have a halting condition,
    // which is the condition where the function stops calling itself.
    // In the previous example, the halting condition is when the parameter k becomes 0.

    /*
    Static vs. Public
    You will often see Java programs that have either static or public attributes and methods.
    In the example above, we created a static method, which means that it can be accessed without
    creating an object of the class, unlike public, which can only be accessed by objects:

    public class Main {
      // Static method
      static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
      }

      // Public method
      public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
      }

      // Main method
      public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
      }
    }
     */

}
