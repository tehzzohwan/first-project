package user.input;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userDetails = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String userName = userDetails.nextLine();

        System.out.print("What is your gender, m / f ? : ");
        String gender = userDetails.nextLine();

        while (!(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"))) {
            System.out.print("Please choose either m or f: ");
            gender = userDetails.nextLine();
        }

        System.out.print("Hello " + userName + " what year were you born?: ");
        int birthYear = userDetails.nextInt();
        int age = ageCalc(birthYear);

        if(gender.equalsIgnoreCase("f")){
            System.out.println("Welcome " + userName + " you are a female who is " + age + " years of age");
        } else {
            System.out.println("Welcome " + userName + " you are a male who is " + age + " years of age");
        }
    }

    // TODO fix year more than current year.
    private static int ageCalc(int birthYr) {
        int presentYear = 2024;
        int age = presentYear - birthYr;
        return age;
    }
}
