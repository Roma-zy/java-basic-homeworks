package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9;

public class User {
    private String name;
    private String secondName;
    private String patronymic;
    private short yearBirth;
    private String email;

    public User(String name, String secondName, String patronymic, short yearBirth, String email) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    public User(String name, String secondName, short yearBirth, String email) {
        this.name = name;
        this.secondName = secondName;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    public User(String name, String secondName, short yearBirth) {
        this.name = name;
        this.secondName = secondName;
        this.yearBirth = yearBirth;
    }

    public User(String name, String secondName, String patronymic, short yearBirth) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.yearBirth = yearBirth;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public short getYearBirth() {
        return yearBirth;
    }

    public void showInfo() {
        System.out.println("ФИО: " + getFullName());
        System.out.println("Год рождения: " + yearBirth + ";");
        System.out.println("e-mail: " + getEmail());
    }

    private String getFullName() {
        return secondName + " " + name + (patronymic == null ? ";" : " " + patronymic + ";");
    }

    private String getEmail() {
        return email == null ? "undefined" : " " + email + ";";
    }
}
