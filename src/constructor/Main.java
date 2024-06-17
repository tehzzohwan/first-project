package constructor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person tami = new Person();

        tami.talk();
        tami.walk();
        tami.sit();

        Person yemu = new Person("Yemu", "brown", 2);

        yemu.talk();
        yemu.walk();
        yemu.sit();

        yemu.setEye("black");
        String yemuEyeColour = yemu.getEye();
        System.out.println(yemuEyeColour);

        yemu.talk();

        String namey = yemu.getName();

        for (char name : namey.toCharArray()) {
            System.out.println(name);
        }

        int[] array = {5, 9, 11};
        minMaxNum(array);

        BankAcct pedro = new BankAcct("Pedro");

        pedro.getBalance();
//        pedro.withdraw(10);
        pedro.deposit(-50);
//        pedro.withdraw(20);
//        pedro.getBalance();

        Student bola = new Student("Bola");

        System.out.println((bola.getCourses()));
        System.out.println(bola.getName());
        bola.addCourse("English");
//        bola.addCourse("Maths");
        System.out.println((bola.getCourses()));
        bola.addCourse("Biology");
        bola.removeCourse("English");
        bola.removeCourse("English");

        System.out.println((bola.getCourses()));

        Circle small = new Circle(3);

        System.out.println("the area of your circle is: " + small.getArea());
        System.out.println("the circumference of your circle is: " + small.getCircumference());

        Animal olie = new Pig("Olie");
        Dog max = new Dog("Max");
        Animal duck = new Animal("Duck");

        olie.animalSound();
        max.animalSound();
        duck.animalSound();


    }
    // input: string output: void


    // method to reverse a string
    // declare a new variable
    // split the string into an array
    // iterate through the array from the back
    //  and start reassigning the values of the string in the declared variable
    // then print the variable

    // the method takes a string and checks if it in an array of names.
    // return the index if present in the arr of names.

    // the method checks an arr and returns the min and max value of the arr.
    // initialize 2 variables minValue and maxValue with the first element in the array.
    // iterate through the array and check if the element is greater the maxValue and less than the minValue variables
    // if the condition evaluates to true the variable is reassigned with the element it's being checked with
    // then print out the min and max values

    // [5, 9, 11]
    public static void minMaxNum(int[] arr) {
        int minValue = arr[0]; // 5
        int maxValue = arr[0]; // 5

        for (int i = 1; i < arr.length; i++) { // 9, 11
            if (arr[i] < minValue) { // 9 < 5, 11 < 5
                minValue = arr[i]; // 5, 5
            }
            if (arr[i] > maxValue) { // 9 > 5, 11 > 9
                maxValue = arr[i]; // 9, 11
            }
        }
        System.out.println("Max value = " + maxValue); // 11
        System.out.println("Min value = " + minValue); // 5
    }


}
