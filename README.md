Project Overview
This project contains the independent implementation of two advanced data structures from scratch in Java:
Category A: Deque (Double-Ended Queue)
Category B: Min Heap

To ensure clean architecture and reusability, the core algorithms (modulo wrapping for the Deque, and Heapify Up/Down for the Min Heap) were separated into their own dedicated file.

Project Structure
Algorithms.java: Contains the core logic (the index wrapping math and the heapify algorithms).
MyDeque.java: A reusable circular array-based Deque with O(1) operations.
MyMinHeap.java: A reusable array-based Min Heap with O(log n) insertion and extraction.
Main.java: The test driver used to demonstrate normal operations and edge-case error handling (using try-catch blocks).

How to Run

Open the project in IntelliJ IDEA.

Ensure you have Java JDK 17 (or higher) installed.

Open Main.java and click the Run button (or press Shift + F10).

The console will display the output for the Deque test, the Min Heap test, and the caught exceptions.

Requirements Met
Implemented two advanced data structures (Deque and Min Heap).
Handled edge cases using IllegalStateException (tested in Main.java).
Analyzed time complexity (O(1) for Deque, O(log n) for Heap).
Separated algorithms into a dedicated file.

