package operator;

public class Operator {
    public static void main(String[] args) {
        arithmeticOperators();
    }

    private static void arithmeticOperators() {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 - sum1;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

}
