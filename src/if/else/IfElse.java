package ifElse;

public class IfElse {
    public static void main(String[] args) {
        ifStatement();
        elseStatement();
        elseIfStatement();
        tenaryOperator();
        switchStatement();
    }

    private static void ifStatement() {
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
    }

    private static void elseStatement() {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    private static void elseIfStatement() {
        int time = 16;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    private static void tenaryOperator() {
        int time = 10;
        String result = (time < 12) ? "Good morning." : "Good evening.";
        System.out.println(result);
    }

    private static void switchStatement() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

//        the default keyword
        String dayNum = "five" ;
        switch (dayNum) {
            case "six":
                System.out.println("Yes today is saturday");
                break;
            case "seven":
                System.out.println("Keep the sabath holy");
                break;
            default:
                System.out.println("Still looking forward to the weekend");
        }
    }
}
