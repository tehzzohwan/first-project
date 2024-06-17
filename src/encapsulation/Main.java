package encapsulation;

import encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        System.out.println("1st: " + myObj.getName());
        myObj.setName("Guero");
        System.out.println("2nd: " + myObj.getName());
    }
}
