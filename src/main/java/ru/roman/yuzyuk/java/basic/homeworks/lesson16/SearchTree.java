package ru.roman.yuzyuk.java.basic.homeworks.lesson16;

import java.util.ArrayList;
import java.util.List;

public class SearchTree<T extends Comparable<T>> implements SearchTreeImpl<T> {
    public Node<T> treeRoot;

    public SearchTree(List<T> list) {
        treeRoot = buildTree(list, 0, list.size() - 1);
    }

    public T find(T searchValue) {
        return search(searchValue, treeRoot);
    }

    public List<T> getSortedList() {
        List<T> result = new ArrayList<>();
        collectToArrayList(result, treeRoot);
        return result;
    }

    private Node<T> buildTree(List<T> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + (end - start) / 2;
        Node<T> node = new Node<>(sortedList.get(middle));
        node.setLeftSide(buildTree(sortedList, start, middle - 1));
        node.setRightSide(buildTree(sortedList, middle + 1, end));
        return node;
    }

    private T search(T searchValue, Node<T> node) {
        if (node == null) return null;

        if (searchValue.equals(node.getValue())) return node.getValue();

        // Вот тут не до конца понял. Понял, что вернется int, что надо наследовать Comparable
        // немного почитал про это, но легче не стало. Мб подскежете где понятно про Comparable обьясняется?
        int compareValue = searchValue.compareTo(node.getValue());

        if (compareValue > 0) {
            return search(searchValue, node.getRightSide());
        }

        return search(searchValue, node.getLeftSide());
    }

    private void collectToArrayList(List<T> list, Node<T> node) {
        if (node == null) return;

        collectToArrayList(list, node.getLeftSide());
        list.add(node.getValue());
        collectToArrayList(list, node.getRightSide());
    }
}
