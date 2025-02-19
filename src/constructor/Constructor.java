package constructor;

public class Constructor {
    /*
    Java Constructors
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created. It can be used to
    set initial values for object attributes:
     */

    int x;  // Create a class attribute

    // Create a class constructor for the Constructor class
    public Constructor() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(); // Create an object of class Constructor (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}
