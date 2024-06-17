package object.oriented.programming;

public class ObjectOrientedProgramming {
    String greet = "Hi"; // Java Class Attributes

    public static void main(String[] args) {
        /*
        object-oriented programming is about creating objects that contain both data and methods.
        Object-oriented programming has several advantages over procedural programming:
        -OOP is faster and easier to execute
        -OOP provides a clear structure for the programs
        -OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        -OOP makes it possible to create full reusable applications with less code and shorter development time

        What are Classes and Objects?
        Classes and objects are the two main aspects of object-oriented programming.
        So, a class is a template for objects, and an object is an instance of a class.
        When the individual objects are created, they inherit all the variables and methods from the class.

        Everything in Java is associated with classes and objects, along with its attributes and methods.
        For example: in real life, a car is an object. The car has attributes, such as weight and color,
        and methods, such as drive and brake.

        A Class is like an object constructor, or a "blueprint" for creating objects.

        Create a Class
        To create a class, use the keyword class:
        public class Main {
          int x = 5;
        }

        Create an Object
        To create an object of Main, specify the class name,
        followed by the object name, and use the keyword new:

        Multiple Objects
        You can create multiple objects of one class

         */

        ObjectOrientedProgramming newObject = new ObjectOrientedProgramming();
        ObjectOrientedProgramming secondNewObject = new ObjectOrientedProgramming();
        newObject.greet = "Hello"; // You can also override existing values
        System.out.println(newObject.greet); // prints Hello
        System.out.println(secondNewObject.greet); // Accessing Attributes (prints Hi)

        // If you don't want the ability to override existing values, declare the attribute as final


        /*
        Java Class Attributes
        In the previous chapter, we used the term "variable" for x in the example (as shown below).
        It is actually an attribute of the class.
        Or you could say that class attributes are variables within a class:
        public class Main {
          int x = 5;
          int y = 3;
        }
         */


        /*
        Accessing Attributes
        You can access attributes by creating an object of the class, and by using the dot syntax (.):
        The following example will create an object of the Main class, with the name myObj.
        We use the x attribute on the object to print its value:
        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);
          }
        }
         */

            /*
            Java Packages & API
            A package in Java is used to group related classes. Think of it as a folder in a file directory.
            We use packages to avoid name conflicts, and to write a better maintainable code.
            Packages are divided into two categories:
            Built-in Packages (packages from the Java API)
            User-defined Packages (create your own packages)

            Built-in Packages
            The Java API is a library of prewritten classes, that are free to use,
            included in the Java Development Environment.
            The library is divided into packages and classes.
            Meaning you can either import a single class (along with its methods and attributes),
            or a whole package that contain all the classes that belong to the specified package.
            To use a class or a package from the library, you need to use the import keyword:

            import package.name.Class;   // Import a single class
            import package.name.*;   // Import the whole package
            */


        /*
        Java Inheritance (Subclass and Superclass)
        In Java, it is possible to inherit attributes and methods from one class to another.
        We group the "inheritance concept" into two categories:
        subclass (child) - the class that inherits from another class
        superclass (parent) - the class being inherited from
        To inherit from a class, use the extends keyword.

        class Vehicle {
          protected String brand = "Ford";        // Vehicle attribute
          public void honk() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
          }
        }

        class Car extends Vehicle {
          private String modelName = "Mustang";    // Car attribute
          public static void main(String[] args) {

            // Create a myCar object
            Car myCar = new Car();

            // Call the honk() method (from the Vehicle class) on the myCar object
            myCar.honk();

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
          }
        }

        If you don't want other classes to inherit from a class, use the final keyword
         */

        /*
        Java Polymorphism
        Polymorphism means "many forms", and it occurs when we have many classes
        that are related to each other by inheritance.

        Example
        class Animal {
          public void animalSound() {
            System.out.println("The animal makes a sound");
          }
        }

        class Pig extends Animal {
          public void animalSound() {
            System.out.println("The pig says: wee wee");
          }
        }

        class Dog extends Animal {
          public void animalSound() {
            System.out.println("The dog says: bow wow");
          }
        }

        class Main {
          public static void main(String[] args) {
            Animal myAnimal = new Animal();  // Create a Animal object
            Animal myPig = new Pig();  // Create a Pig object
            Animal myDog = new Dog();  // Create a Dog object
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
          }
        }
         */

    }
}
