package ru.roman.yuzyuk.java.basic.homeworks.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(getListIntegers(1, 9999));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(44);

        System.out.println(getSumItemsMoreThenFive(integers));

        changeAllItems(22, integers);
        System.out.println(integers);

        addValueEachElement(11, integers);
        System.out.println(integers);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Вася", (byte) 22));
        employeeList.add(new Employee("Петя", (byte) 60));
        employeeList.add(new Employee("Ира", (byte) 25));
        employeeList.add(new Employee("Ян", (byte) 74));

        System.out.println(getEmployeeNames(employeeList));
        System.out.println(filterEmployeeByAge(employeeList, (byte) 60));

        System.out.println(averageAgeEmployeesExceedsSpecifiedValue(employeeList, (byte) 30));
        System.out.println(averageAgeEmployeesExceedsSpecifiedValue(employeeList, (byte) 50));

        System.out.println(getYoungestEmployee(employeeList));
    }


    public static List<Integer> getListIntegers(int min, int max) {
        List<Integer> result = new ArrayList<>(max - min);

        for (int i = min; i <= max; i++) {
            result.add(i);
        }

        return result;
    }

    public static int getSumItemsMoreThenFive(List<Integer> list) {
        return !list.isEmpty() ? list.stream().reduce((acc, item) -> acc + item).get() : 0;
    }

    public static void changeAllItems(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static void addValueEachElement(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
    }

    public static List<String> getEmployeeNames (List<Employee> employees) {
        return employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());
    }

    public static List<Employee> filterEmployeeByAge (List<Employee> employees, byte minAge) {
        return employees.stream().filter(employee -> employee.getAge() >= minAge).collect(Collectors.toList());
    }

    public static boolean averageAgeEmployeesExceedsSpecifiedValue (List<Employee> employees, byte age) {
        if (employees.isEmpty()) {
            return false;
        }
        int sumAge = employees.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        byte averageAge = (byte) (sumAge / employees.size());

        return averageAge > age;
    }

    public static Employee getYoungestEmployee (List<Employee> employees) {
        return employees
                .stream()
                .reduce(new Employee(), (acc, item) -> acc.getAge() < item.getAge() ? acc : item );
    }
}
