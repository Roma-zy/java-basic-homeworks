package ru.roman.yuzyuk.java.basic.homeworks.lesson27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.print("Введите искомую строку: ");
            String searchString = scanner.nextLine();

            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line);
            }

            int occurrences = getCountMatches(fileContent.toString(), searchString);

            System.out.println("Количество совпадений: " + occurrences);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getCountMatches(String text, String searchString) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(searchString, index)) != -1) {
            count++;
            index += searchString.length();
        }

        return count;
    }
}
