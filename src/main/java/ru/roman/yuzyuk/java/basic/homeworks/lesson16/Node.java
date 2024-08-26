package ru.roman.yuzyuk.java.basic.homeworks.lesson16;

public class Node<T> {
    private T value;
    private Node<T> leftSide;
    private Node<T> rightSide;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> leftSide) {
        this.value = value;
        this.leftSide = leftSide;
    }

    public Node(T value, Node<T> leftSide, Node<T> rightSide) {
        this.value = value;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
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
