package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        // Program that accepts a number and prints out the word (1 - 10)
       int[] arr = {1, -3, -2, -3, 5};
//       boolean result = twoElement(arr, 4);
//        int result = biggestNo();
        System.out.println(Arrays.toString(arr));

//        printMultiplicationTable();

    }

    //input = int
    /*
    output = String
     */

    /*
    get the input
     */
    private static String numberConverter() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("input a number: ");
        int num = userInput.nextInt();

//        if (num == 1) { // 5 == 1 = false
//            return "One";
//        } else if (num == 2) { // 5 == 2 = false
//            return "Two";
//        } else if (num == 3) { // 5 == 3 = false
//            return "Three";
//        } else if (num == 4) { // 5 == 4 = false
//            return "Four";
//        } else {
//            return "Five"; // returns "Five"
//        }

        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            default:
                return "not present";
        }
    }

    //program that takes 2 number first and the last and returns a sum of the number between them
    //input int
    //output int
    //process :
    /*
    initialize a variable with 0
    then iterate through the numbers with i as the first number,
    i should be less than or equals to the second number
    while getting the numbers reassign the addition to your variable
     */

    private static int addsInBetween() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first number: ");
        int first = input.nextInt();

        System.out.print("Input your last number(> the first number): ");
        int last = input.nextInt();

        int sum = 0;
        int count = 0;
        // average = addition of all no. / no. of elements
        // first = 5, last = 10
        for (int i = first; i <= last; i++) { // i = 1, i = 2, i = 3
            sum += i; // 0 + 1 = 1, 1 + 2 = 3, 3 + 3 = 6
            count += 1;
        }
        return sum / count; //returns 6
    }

    private static int addsInBetweenUsingWhileLoop() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first number: ");
        int first = input.nextInt();

        System.out.print("Input your last number(> the first number): ");
        int last = input.nextInt();

        int sum = 0;
        int count = 0;
        // average = addition of all no. / no. of elements
        // first = 5, last = 10
        int value = first; // 5, 6, 7, 8, 9, 10, 11
        while (value <= last) { // true, true, true, true, true, true, false
            sum += value; // 5, 11, 18, 26, 35, 45
            count += 1; // 1, 2, 3, 4, 5, 6
            value++; // 6, 7, 8, 9, 10, 11
        }
        return sum / count; //returns 45 / 6 = 7.5
    }

    private static int addsInBetweenUsingDoWhileLoop() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first number: ");
        int first = input.nextInt();

        System.out.print("Input your last number(> the first number): ");
        int last = input.nextInt();

        int sum = 0;
        int count = 0;
        // average = addition of all no. / no. of elements
        // first = 5, last = 10
        int val = first; // 5, 6, 7, 8, 9, 10
        do {
            sum += val; // 5, 11, 18, 26, 35, 45
            count += 1; // 1, 2, 3, 4, 5, 6
            val++; // 6, 7, 8, 9, 10, 11
        } while (val <= last); // true, true, true, true, true, false
        return sum / count; //returns 45 / 6 = 7.5
    }

    // program that takes two input from the user and tells the user the biggest one
    private static int biggestNo() {
        Scanner numbers = new Scanner(System.in);

        System.out.println("input the first number: ");
        String num = numbers.nextLine();

//        System.out.println("input the second number: ");
//        int secondNo = numbers.nextInt();

        String[] splitedString = num.split(",");
        int firstNum =   Integer.parseInt(splitedString[0]);
        int secondNum =   Integer.parseInt(splitedString[1]);

        // to convert int to String: String.valueOf() method / Integer.toString() method

//        if (firstNo > secondNo) {
//            return firstNo;
//        } else {
//            return secondNo;
//        }

       return firstNum > secondNum ? firstNum: secondNum;
    }


    // program that takes a start and end and print the sum of the odd number and the sum of the even numbers
    /*
    * input = int, int
    * output = void
    *
    * process:
    * initialize 2 variables even and odd
    * use a for loop to iterate through the elements
    * check if the element is odd or even with a modulo operator
    * if element % 2 equals 0 add the value to the even variable
    * else add to the odd variable
    * then print out the total of the odd and that of the even
    * */

    private static void sumOddAndEven() {
        Scanner inputs = new Scanner(System.in);

        System.out.println("input the first number: ");
        int start = inputs.nextInt();

        System.out.println("input the last number: ");
        int end = inputs.nextInt();

        int odd = 0;
        int even = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("sum of the odd = " + odd);
        System.out.println("sum of the even = " + even);


    }

    // takes an array and sort the array element
    /*
    input = arr
    ouput = arr
    process:
    initialize an empty array
    iterate through the array
     */

    /*
    in = arr, int
    out = boolean
    process:
    make a nested for loop to check if both values equals the second arg then return a boolean
    but make sure it's not adding to itself
    i.e on every loop the second loop index is 1 > the first loop
     */
    private static boolean twoElement(int[] arr, int checker) {
        // {1, -3, -2, -3, 5}
        for (int i = 0; i < (arr.length - 1); i++) { //
            for (int j = (i + 1); j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == checker) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void printTheBiggest() {
        Scanner inputs = new Scanner(System.in);

        System.out.print("enter three numbers: ");
        String userInput = inputs.nextLine();

        String[] splitedUserInput = userInput.split(",");

        int biggest = Integer.parseInt(splitedUserInput[0]);
        int second = Integer.parseInt(splitedUserInput[1]);
        int third = Integer.parseInt(splitedUserInput[2]);

        int[] userInputValuesArr = {biggest, second, third};

        for (int i = 1; i < userInputValuesArr.length; i++) { // [5, 9, 11] 9, 11
            if (biggest < userInputValuesArr[i] ) { // 5 < 9, 9 < 11
                biggest = userInputValuesArr[i]; // 9, 11
            }
        }
        System.out.print(biggest); // 11
    }

    private static void printMultiplicationTable() {
        Scanner inputs = new Scanner(System.in);

        System.out.print("enter a number: ");
        int userInput = inputs.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(userInput + " x " + i + " = " + userInput * i);
        }
    }

}
