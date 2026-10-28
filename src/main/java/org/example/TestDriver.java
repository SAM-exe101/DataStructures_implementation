package org.example;

public class TestDriver {
    public static void main(String[] args) {
        System.out.println("=== 1. MyDeque Test ===");
        MyDeque deque = new MyDeque(4);
        deque.addLast(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        try {
            deque.removeFirst();
            deque.removeFirst();
        } catch (IllegalStateException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        System.out.println("\n=== 2. MyMinHeap Test ===");
        MyMinHeap heap = new MyMinHeap(5);
        heap.insert(40);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);
        System.out.println("Min element: " + heap.peek());
        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.println("New Min element: " + heap.peek());

        try {
            heap.extractMin();
            heap.extractMin();
            heap.extractMin();
            heap.extractMin(); // FOURTH CALL ADDED TO TRIGGER THE ERROR
        } catch (IllegalStateException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}