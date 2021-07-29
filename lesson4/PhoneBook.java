package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneLastname = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneLastname.add(phoneNumber);
        phoneBook.put(lastName, phoneLastname);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сапин", "124567672242");
        phoneBook.add("Сапин1", "12456767111");
        phoneBook.add("Сапин2", "12456766362");
        phoneBook.add("Сапин3", "12456788672");
        phoneBook.add("Сапин4", "12456346724");

        System.out.println(phoneBook.get("Сапин"));
    }
}
