package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9;

import ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9.object.value.Color;

public class Box {
    private int width;
    private int length;
    private int height;
    private boolean isOpened;
    private String color;
    private String item;

    public Box(int width, int length, int height, Color color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color.getHex();
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public String getColor() {
        return color;
    }

    public String getItem() {
        return item;
    }

    public Box repaint(Color color) {
        this.color = color.getHex();

        System.out.println("Коробка перекрашена в: " + this.color);
        return this;
    }

    public Box open() {
        if(isOpened) {
            System.out.println("Коробка уже открыта");
            return this;
        }
        isOpened = true;

        System.out.println("Коробка открылась");
        return this;
    }

    public Box close() {
        if(!isOpened) {
            System.out.println("Коробка уже закрыта");
            return this;
        }
        isOpened = false;

        System.out.println("Коробка закрылась");
        return this;
    }

    public Box toggle() {
        if (isOpened) {
            return close();
        }

        return open();
    }

    public Box fill(String item) {
        if (!isOpened) {
            System.out.println("Сперва откройте коробку");
            return this;
        }

        if(this.item != null) {
            System.out.println("Коробка уже заполнена");
            return this;
        }

        this.item = item;

        return this;
    }

    public Box clear() {
        if (!isOpened) {
            System.out.println("Сперва откройте коробку");
            return this;
        }

        if(this.item == null) {
            System.out.println("Коробка уже пуста");
            return this;
        }

        String prevValue = this.item;
        this.item = null;

        System.out.println("Из коробки достали - " + prevValue);
        System.out.println("Коробка пуста");
        return this;
    }

    public Box showInfo() {
        System.out.println("Информация о коробке:");
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Высота: " + height);
        System.out.println("Открыта: " + (isOpened ? "Да" : "Нет"));
        System.out.println("Цвет: " + color);
        System.out.println("Содержимое: " + (item != null ? item : "Нет содержимого"));

        return this;
    }
}
