package ru.roman.yuzyuk.java.basic.homeworks.lesson16;

public class Node<T> {
    private final T value;
    private Node<T> leftSide;
    private Node<T> rightSide;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Node<T> leftSide) {
        this.leftSide = leftSide;
    }

    public Node<T> getRightSide() {
        return rightSide;
    }

    public void setRightSide(Node<T> rightSide) {
        this.rightSide = rightSide;
    }
}
