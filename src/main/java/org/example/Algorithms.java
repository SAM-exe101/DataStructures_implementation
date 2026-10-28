package org.example;

public class Algorithms {

    // ALGORITHM 1: The Deque Wrapping Logic
    public static int getNextIndex(int currentIndex, int capacity) {
        return (currentIndex + 1) % capacity;
    }

    public static int getPrevIndex(int currentIndex, int capacity) {
        return (currentIndex - 1 + capacity) % capacity;
    }

    // ALGORITHM 2: The Heapify Up Logic
    public static void heapifyUp(int[] heap, int index) {
        while (index > 0 && heap[index] < heap[(index - 1) / 2]) {
            int temp = heap[index];
            heap[index] = heap[(index - 1) / 2];
            heap[(index - 1) / 2] = temp;
            index = (index - 1) / 2;
        }
    }

    // ALGORITHM 3: The Heapify Down Logic
    public static void heapifyDown(int[] heap, int size, int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;

        if (smallest != index) {
            int temp = heap[index];
            heap[index] = heap[smallest];
            heap[smallest] = temp;
            heapifyDown(heap, size, smallest);
        }
    }
}