package ru.roman.yuzyuk.java.basic.homeworks.lesson17.user.interactions;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInteractions implements UserInteractionsImpl {
    Scanner in = new Scanner(System.in);

    public void printList(List<String> list)  {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }

    public String selectFromList(List<String> list, String retryMessage) {
        try {
            int fileIndex =  in.nextInt() - 1;
            in.nextLine();

            if (fileIndex < 0 || fileIndex >= list.size()) {
                System.out.println(retryMessage);
                return selectFromList(list, retryMessage);
            }

            return list.get(fileIndex);
        } catch (InputMismatchException e) {
            in.nextLine();
            printList(list);
            System.out.println("Необходимо ввести номер файла");
            return selectFromList(list, retryMessage);
        }
    }

    public String askEnterLine() {
        System.out.println("Введите строку");
        return in.nextLine() + System.lineSeparator();
    }
}
