package ru.roman.yuzyuk.java.basic.homeworks.lesson13;

public class Main {
    public static void main(String[] args) {
        String[][][] arraysForTest = {
                {
                        {"1", "1", "1", "1"},
                },
                {
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "lalala", "1", "1"},
                        {"1", "1", "1", "1"},
                },
                {
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                        {"1", "1", "1", "1"},
                }
        };

        for (String[][] array : arraysForTest) {
            try {
                System.out.println(sumElementsTwoDimensionalArray(array));
            } catch (AppArraySizeException | AppArrayDataException error) {
                System.out.println("\u001B[31m" + error + "\u001B[0m");
            }
        }

        System.out.println("Штатно завершаем программу");
    }

    public static int sumElementsTwoDimensionalArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4) {
            throw new AppArraySizeException();
        }
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException();
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }

        return result;
    }
}
