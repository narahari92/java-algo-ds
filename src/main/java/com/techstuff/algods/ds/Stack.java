package com.techstuff.algods.ds;

public class Stack<T> {

    private Object[] elements;
    
    private int top;
    
    public Stack(int size) {
        this.elements = new Object[size];
        this.top = -1;
    }
    
    public void push(T elem) {
        if(isFull()) {
            throw new RuntimeException("Stack overflow error");
        }
        this.elements[++top] = elem;
    }
    
    @SuppressWarnings("unchecked")
    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack underflow error");
        }
        return (T) elements[top--];
    }
    
    public boolean isEmpty() {
        return top < 0;
    }
    
    public boolean isFull() {
        return top == elements.length - 1;
    }
    
}
