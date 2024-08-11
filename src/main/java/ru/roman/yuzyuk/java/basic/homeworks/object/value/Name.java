package ru.roman.yuzyuk.java.basic.homeworks.object.value;

public class Name {
    private final String name;

    public Name(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Не корректное имя!");
        }
    }

    public String getName() {
        return name;
    }

    private boolean isValidName(String name) {
        if (name == null || name.length() < 2) {
            return false;
        }

        String regex = "^[a-zA-Zа-яА-Я\\- ]+$";
        return name.matches(regex);
    }
}
