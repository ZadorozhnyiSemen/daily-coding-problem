package com.semen.z.problem_3;

public class Node<T> {

    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(T data) {
        this.data = data;
    }
}
