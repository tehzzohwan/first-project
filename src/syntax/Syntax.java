package syntax;

public class Syntax {
    public static void main(String[] args) {
        //  you can use the println() method to output values or print text in Java:
        // When you are working with text, it must be wrapped inside double quotations marks "".
        System.out.println("Hello World");
        System.out.println(23);
        //This is a single line comment.
        /*
        And this is a
        multi line comment
        */
        ageCalculator("Bob", 1998);
    }

    private static void ageCalculator(String name, int year) {
        int presentYear = 2024;
        int age = presentYear - year;

        System.out.println("Hello " + name + " you are " + age + " years old");
    }
}
