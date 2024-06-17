package datatypes;

public class DataTypes {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
        typeCasting();
        strings();
    }

    private static void typeCasting() {
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }

    private static void strings() {
        String greeting = "Hello";
        System.out.println(greeting);

//        string length (.length())
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

//        more string method
        String text = "Hello World";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

//        finding a character in a string
        /*The indexOf() method returns the index (the position) of the first occurrence
           of a specified text in a string (including whitespace):
         */
        String locate = "Please locate where 'locate' occurs!";
        System.out.println(locate.indexOf("locate"));

//        string concatenation
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

//        If you add a number and a string, the result will be a string concatenation:
        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)
    }

    private static void booleans() {
//        boolean values
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

//        boolean expression. A Boolean expression returns a boolean value: true or false.
        int x = 10;
        int y = 9;
        System.out.println(x > y);

    }
}