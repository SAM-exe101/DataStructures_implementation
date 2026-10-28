package org.example;

public class MyMinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MyMinHeap(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty() { return size == 0; }

    public void insert(int value) {
        if (size >= capacity) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        size++;
        // USING THE ALGORITHM FILE
        Algorithms.heapifyUp(heap, size - 1);
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    public int extractMin() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        // USING THE ALGORITHM FILE
        Algorithms.heapifyDown(heap, size, 0);
        return min;
    }
}