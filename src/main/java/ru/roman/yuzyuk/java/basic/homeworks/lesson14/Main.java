package ru.roman.yuzyuk.java.basic.homeworks.lesson14;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArrayListIntegers(1, 9999));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(44);

        System.out.println(getSumItemsMoreThenFive(integers));

        changeAllItems(22, integers);
        System.out.println(integers);

        addValueEachElement(11, integers);
        System.out.println(integers);


        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Вася", (byte) 22));
        employeeArrayList.add(new Employee("Петя", (byte) 60));
        employeeArrayList.add(new Employee("Ира", (byte) 25));
        employeeArrayList.add(new Employee("Ян", (byte) 74));

        System.out.println(getEmployeeNames(employeeArrayList));
        System.out.println(filterEmployeeByAge(employeeArrayList, (byte) 60));

        System.out.println(averageAgeEmployeesExceedsSpecifiedValue(employeeArrayList, (byte) 30));
        System.out.println(averageAgeEmployeesExceedsSpecifiedValue(employeeArrayList, (byte) 50));

        System.out.println(getYoungestEmployee(employeeArrayList));
    }


    public static ArrayList<Integer> getArrayListIntegers(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>(max - min);

        for (int i = min; i <= max; i++) {
            result.add(i);
        }

        return result;
    }

    public static int getSumItemsMoreThenFive(ArrayList<Integer> list) {
        return !list.isEmpty() ? list.stream().reduce((acc, item) -> acc + item).get() : 0;
    }

    public static void changeAllItems(int value, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static void addValueEachElement(int value, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
    }

    public static ArrayList<String> getEmployeeNames (ArrayList<Employee> employees) {
        return (ArrayList<String>) employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());
    }

    public static ArrayList<Employee> filterEmployeeByAge (ArrayList<Employee> employees, byte minAge) {
        return (ArrayList<Employee>) employees.stream().filter(employee -> employee.getAge() >= minAge).collect(Collectors.toList());
    }

    public static boolean averageAgeEmployeesExceedsSpecifiedValue (ArrayList<Employee> employees, byte age) {
        if (employees.isEmpty()) {
            return false;
        }
        int sumAge = employees.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        byte averageAge = (byte) (sumAge / employees.size());

        return averageAge > age;
    }

    public static Employee getYoungestEmployee (ArrayList<Employee> employees) {
        return employees
                .stream()
                .reduce(new Employee(), (acc, item) -> acc.getAge() < item.getAge() ? acc : item );
    }
}
