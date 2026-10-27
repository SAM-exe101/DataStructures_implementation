package org.example;

public class MyDeque {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyDeque(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == capacity; }

    public void addFirst(int value) {
        if (isFull()) throw new IllegalStateException("Deque is full");
        // USING THE ALGORITHM FILE
        front = Algorithms.getPrevIndex(front, capacity);
        elements[front] = value;
        size++;
    }

    public void addLast(int value) {
        if (isFull()) throw new IllegalStateException("Deque is full");
        // USING THE ALGORITHM FILE
        rear = Algorithms.getNextIndex(rear, capacity);
        elements[rear] = value;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) throw new IllegalStateException("Deque is empty");
        int val = elements[front];
        // USING THE ALGORITHM FILE
        front = Algorithms.getNextIndex(front, capacity);
        size--;
        return val;
    }

    public int removeLast() {
        if (isEmpty()) throw new IllegalStateException("Deque is empty");
        int val = elements[rear];
        // USING THE ALGORITHM FILE
        rear = Algorithms.getPrevIndex(rear, capacity);
        size--;
        return val;
    }
}