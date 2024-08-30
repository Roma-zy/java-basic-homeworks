package ru.roman.yuzyuk.java.basic.homeworks.lesson17.user.interactions;

import java.util.List;

public interface UserInteractionsImpl {
    public void printList(List<String> list);
    public String selectFromList(List<String> list, String retryMessage);
    public String askEnterLine();
}
