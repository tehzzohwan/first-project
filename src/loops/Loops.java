package loops;

public class Loops {
    public static void main(String[] args) {
//        whileLoop();
//        doWhile();
//        forLoop();
        forEach();
//        breakContinue();
//        arr();
    }

    private static void whileLoop() {
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("sorry next time!!!");
            } else {
                System.out.println("Yay it's a six!!!");
            }
            dice += 1;
        }
    }

    private static void doWhile() {
/*
 The loop will always be executed at least once, even if the condition is false,
 because the code block is executed before the condition is tested:
 */
        int i = 5;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 11);
    }

    private static void forLoop() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    private static void forEach() {
        String[] cars = {"Audi", "Toyota", "Lexus", "Chevrolet"};

        forLoop();

        for (String car: cars) {
            System.out.println(car);
        }
    }

    private static void breakContinue() {
        /*
        Java Break
It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.
i.e it stops the loop
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        /*
        Java Continue
        The continue statement breaks one iteration (in the loop),
        if a specified condition occurs,
        and continues with the next iteration in the loop.
         */
        for (int j = 0; j < 8; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
    }

    private static void arr() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[1] = "Nissan";
        System.out.println(cars[1]);

//        array length
        System.out.println("array length = " + cars.length);

//        array loop
        String[] vehicles = {"Audi", "Toyota", "Lexus", "Chevrolet"};
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }

    }
}
