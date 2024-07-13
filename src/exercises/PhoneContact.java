package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneContact {
    private static HashMap<String, String> contacts = new HashMap<String, String>();
    private static Scanner userInput = new Scanner(System.in);
    /*
    Phone contacts application
    An application that allows users to store and manage their contacts' information efficiently.
    add contact, remove contact, get contact, show all contacts and edit contact
     */

    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        String[] menu = {"Add Contact", "Remove contact", "Get all contacts", "Edit contact", "Exit"};

        while (true) {
            System.out.println("=========");
            System.out.println("####### -Phonebook- #######");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("Select a number: ");
            int menuInput = userInput.nextInt();
            menuHandler(menuInput);
        }
    }

    private static void menuHandler(int menuInput) {
        switch (menuInput) {
            case 1:
                addContact();
                break;
            case 2:
                removeContact();
                break;
            case 3:
                getAllContacts();
                break;
            case 4:
                editContact();
                break;
            case 5:
                System.out.println("Exited Phone book");
                System.exit(0);
        }
    }

    private static void addContact() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String phoneNumber = userInput.nextLine();
        System.out.print("Enter the name: ");
        String name = userInput.nextLine();
        if (((phoneNumber.length() != 11) || ((name.length() < 2) || (name.length() > 20)))) { // (phoneNumber.isBlank() || name.isBlank()) &&
            System.out.println("Error !!!");
            System.out.println(" *Input fields cannot be blank\n *Phone number must be 11 digit without the country code\n *Name length cannot be less than 2 and more than 20");
        } else if (contacts.containsKey(name)) {
            System.out.print("contact '" + name + "' exist do you want to overwrite (y/n): ");
            String overwriteResponse = userInput.nextLine();
            if (overwriteResponse.equalsIgnoreCase("y")) {
                contacts.replace(name, contacts.get(name), phoneNumber);
                System.out.println(name + "'s number is overwritten as " + phoneNumber + " on your contact.");
            } else {
                System.out.println("contact " + "'" + name + "'" + " retained.");
            }
        } else {
            contacts.put(name, phoneNumber);
            System.out.println(phoneNumber + " is saved as " + name + " on your contact.");
        }

    }

    private static void removeContact() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the contact name you'll like to delete: ");
        String name = userInput.nextLine();

        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println(name + " has been removed from your contact.");
        } else {
            System.out.println(name + " cannot be found on your contact.");
        }

    }

    private static void getAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Your contact is empty!!!");
        } else {
            for (String name : contacts.keySet()) {
                System.out.println(name + ": " + contacts.get(name));
            }
        }
    }

    private static void editContact() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the contact name you'll like to edit: ");
        String name = userInput.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println(name + ": " + contacts.get(name));
            System.out.println("Input the new number: ");
            String phoneNumber = userInput.nextLine();
            contacts.replace(name, contacts.get(name), phoneNumber);
        } else {
            System.out.println(name + " is not present in your contact");
        }
    }
}
