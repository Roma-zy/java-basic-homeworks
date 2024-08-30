package ru.roman.yuzyuk.java.basic.homeworks.lesson17;

import ru.roman.yuzyuk.java.basic.homeworks.lesson17.files.FileManager;
import ru.roman.yuzyuk.java.basic.homeworks.lesson17.files.FileManagerImpl;
import ru.roman.yuzyuk.java.basic.homeworks.lesson17.user.interactions.UserInteractions;
import ru.roman.yuzyuk.java.basic.homeworks.lesson17.user.interactions.UserInteractionsImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileManagerImpl fileManager = new FileManager();
        UserInteractionsImpl userInteractions = new UserInteractions();

        List<String> fileList = fileManager.getFilesInRoot();

        userInteractions.printList(fileList);
        System.out.println("Выбирите файл");
        String selectedFileName = userInteractions.selectFromList(fileList, "Нет такого файла, повторите выбор");

        System.out.println(fileManager.getFileContent(selectedFileName));

        String addToFile = userInteractions.askEnterLine();

        fileManager.writeLineToFile(selectedFileName, addToFile);
    }
}
