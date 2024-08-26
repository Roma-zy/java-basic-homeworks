package ru.roman.yuzyuk.java.basic.homeworks.lesson16;

import java.util.List;

public interface SearchTreeImpl<T> {
    /**
     * @param element to find
     * @return element if exists, otherwise - null
     */
    T find(T element);

    List<T> getSortedList();
}
