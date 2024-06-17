package variable;

public class Variable {
    /*
    diff types of variables
    String, int, float, char, boolean
     */
    public static void main(String[] args) {
        // To create a variable, you must specify the type and assign it a value:
        int houseNum = vary(73);
        int strNum = finalVariable();
        String prefix = "my house number is ";
        System.out.println(prefix + houseNum);
        System.out.println(houseNum + strNum);
        manyVar();
        oneToManyVar();
    }

    private static int vary(int num) {
        return (num);
    }

    private static int finalVariable() {
//        final is just like const
        final int myNum = 60;
//        myNum = 30; this will result in an error.
        return myNum;
    }

//    declare many variables
    private static void manyVar() {
        int x = 10, y = 30, z = 20;
        System.out.println("manyVar: " + ( x + y + z));
    }

//    one value to many variables
    private static void oneToManyVar() {
        int x, y, z;
        x = y = z = 30;
        System.out.println("oneToManyVar: " + (x + y + z));
    }
}
