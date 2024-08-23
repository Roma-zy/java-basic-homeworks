package ru.roman.yuzyuk.java.basic.homeworks.lesson15;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван Иванович", "+79999999999");
        phoneBook.add("Игорев Игорь Игоревич", "+78888888888");
        phoneBook.add("Аннова Анна Анновна", "+77777777777");
        phoneBook.add("Петров Петр Петрович", "+76666666666");
        phoneBook.add("Петров Петр Петрович", "+76666666660");
        phoneBook.add("Петров Петр Петрович", "+76666666661");

        System.out.println(phoneBook.find("Васек"));
        System.out.println(phoneBook.find("Иванов Иван Иванович"));
        System.out.println(phoneBook.find("Петров Петр Петрович"));

        System.out.println(phoneBook.containsPhoneNumber("+78888888888"));
        System.out.println(phoneBook.containsPhoneNumber("+111"));
    }
}
