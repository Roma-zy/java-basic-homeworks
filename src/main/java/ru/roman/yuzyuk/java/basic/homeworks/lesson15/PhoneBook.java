package ru.roman.yuzyuk.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook implements IPhoneBook {
    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook
                .get(name)
                .add(phoneNumber);

            return;
        }

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public List<String> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> phoneNumbers : phoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
