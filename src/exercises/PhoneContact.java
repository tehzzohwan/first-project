package exercises;

import java.util.HashMap;
import java.util.LinkedList;

public class PhoneContact {
    private static HashMap<String, String> contacts = new HashMap<String, String>(); /*

    -mae it interactive
    - it'll give you option addContact, removeContact. getAllContact, editAContact
    - you can't have two same keys

    Phone contacts application
    An application that allows users to store and manage their contacts' information efficiently.
    add contact, remove contact, get contact phone number, show all contacts
    Only name and phone number should be saved.

    create an empty constructor
    create a constructor with parameters
    create getters and setters
     */

    public static void main(String[] args) {
        addContact("ola", "09099115297");
        addContact("ola", "09099117297");
        getAllContacts();
    }

    private static void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println(phoneNumber + " is saved as " + name + " on your contact.");
    }

    private static void removeContact(String name) {
        contacts.remove(name);
        System.out.println(name + " has been removed from your contact.");
    }

    private static void getAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Your contact is empty!!!");
        } else {
            for (String name : contacts.keySet()) {
                System.out.print(name + ": " + contacts.get(name));
            }
        }
    }
}
