package com.test.numbers;

class Node {

    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.setValue(value);
        setRight(null);
        setLeft(null);
    }

    public boolean hasChildren() {
        return this.getLeft() != null || this.getRight() != null;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
}