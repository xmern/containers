package org.example;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> AdressBook = new HashMap<String, String>();
        // CRUD
        // C add values name to an adress
        AdressBook.put("Kc", "XC7 systems");
        AdressBook.put("Presley", "Presidential Road");

        // R
        System.out.println(AdressBook);
        System.out.println(AdressBook.get("Kc"));
        System.out.println(AdressBook.size());

        // D
        AdressBook.remove("Kc");
        System.out.println(AdressBook);
        System.out.println(AdressBook.get("Kc"));

        AdressBook.clear();






    }
}