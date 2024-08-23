package ru.roman.yuzyuk.java.basic.homeworks.lesson15;

import java.util.List;

public interface IPhoneBook {
    void add(String name, String phoneNumber);
    List<String> find(String name);
    boolean containsPhoneNumber(String phoneNumber);
}
