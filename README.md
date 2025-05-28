## 📚 **DSA Notes Project: Master Template**

You can use this as a **living document** to organize your study notes. I’ll scaffold all three main sections now: **Data Structures**, **Algorithms**, and **Problem Log**.

---

## 🧱 Section 1: Data Structures

---

## 🧱 **Array**

### 🔹 **Definition**

* A **linear data structure** that stores elements in **contiguous memory**.
* Each element can be accessed using an **index** (0-based in most languages).

### 🔹 **Types of Arrays**

* **One-Dimensional Array**: Linear list of elements.
* **Multi-Dimensional Array**: Arrays of arrays (e.g., 2D matrix).
* **Dynamic Array**: Auto-resizing array (e.g., `ArrayList` in Java, `vector` in C++).

### 🔹 **Implementation**

* **Static Array**: Fixed size at compile time or initialization.
* **Dynamic Array**: Resizable array using doubling strategy.

```cpp
int arr[5]; // Static array in C++
std::vector<int> vec; // Dynamic array
```

### 🔹 **Operations & Time Complexities**

| Operation                  | Time Complexity |
| -------------------------- | --------------- |
| **Access (by index)**      | O(1)            |
| **Search**                 | O(n)            |
| **Insert at end**          | O(1)\*          |
| **Insert at middle/start** | O(n)            |
| **Delete at end**          | O(1)            |
| **Delete at middle/start** | O(n)            |

> \*O(1) amortized for dynamic arrays with doubling

### 🔹 **Use Cases / Applications**

* Random access data
* Lookup tables
* Fixed-size storage
* Buffer and cache implementations

### 🔹 **Pros**

* **O(1)** access by index
* Simple memory layout
* Supported natively in most languages

### 🔹 **Cons**

* **Fixed size** (for static arrays)
* Insertion/deletion can be **costly**
* May lead to **wasted space** or reallocation (in dynamic arrays)

---

## 🧱 **Linked List**

### 🔹 **Definition**

* A **linear data structure** where each element (node) stores data and a **reference to the next node**.
* Elements are not stored contiguously in memory.

### 🔹 **Types of Linked Lists**

* **Singly Linked List**: Each node points to the next.
* **Doubly Linked List**: Nodes point to both next and previous nodes.
* **Circular Linked List**: Last node links to the first node.

### 🔹 **Implementation**

* Nodes are dynamically allocated and connected via pointers.

```cpp
struct Node {
    int data;
    Node* next;
};
```

### 🔹 **Operations & Time Complexities**

| Operation           | Time Complexity |
| ------------------- | --------------- |
| **Access by index** | O(n)            |
| **Search**          | O(n)            |
| **Insert at head**  | O(1)            |
| **Insert at tail**  | O(1)\*          |
| **Delete at head**  | O(1)            |
| **Delete at tail**  | O(n) (SLL)      |

> \*O(1) insertion at tail if tail pointer is maintained

### 🔹 **Use Cases / Applications**

* Dynamic memory allocation
* Implementing stacks, queues, hash tables (chaining)
* Efficient insertions/deletions in lists

### 🔹 **Pros**

* **Dynamic size** (no need to define size ahead)
* Fast insertions/deletions at head/tail (with pointer)

### 🔹 **Cons**

* **O(n)** traversal for access/search
* Extra memory for pointers
* Not cache-friendly due to non-contiguous storage

---

## 🧱 **Queue**

### 🔹 **Definition**

* A **linear data structure** that follows the **FIFO** (First-In, First-Out) principle.
* Elements are inserted at the **rear** and removed from the **front**.

### 🔹 **Types of Queues**

* **Simple Queue**: Standard FIFO behavior.
* **Circular Queue**: The rear wraps around to the front when space is available.
* **Deque (Double-Ended Queue)**: Insertion and deletion allowed from both ends.
* **Priority Queue**: Elements are ordered based on priority rather than insertion order.

### 🔹 **Implementation**

* **Array-based Queue**:

  * Needs management of front and rear pointers.
  * Static size unless using dynamic arrays.
* **Linked List-based Queue**:

  * Nodes linked with next pointers.
  * Dynamic size.

```cpp
// Linked List Implementation (C++)
struct Node {
    int data;
    Node* next;
};

class Queue {
    Node* front;
    Node* rear;
public:
    Queue() { front = rear = nullptr; }
    void enqueue(int x);
    void dequeue();
    int peek();
    bool isEmpty();
};
```

### 🔹 **Operations & Time Complexities**

| Operation      | Time Complexity |
| -------------- | --------------- |
| **Enqueue**    | O(1)            |
| **Dequeue**    | O(1)            |
| **Peek/Front** | O(1)            |
| **isEmpty**    | O(1)            |

### 🔹 **Use Cases / Applications**

* CPU/IO scheduling
* BFS traversal in graphs
* Task scheduling (thread pools, printers)
* Buffer queues in networks

### 🔹 **Pros**

* **Simple and predictable** processing order
* Efficient enqueue and dequeue (O(1))
* Ideal for **stream-like** or **time-ordered** processes

### 🔹 **Cons**

* **Array-based queues** may waste space unless circular
* **Not suitable** for random access or LIFO operations

---

## ⚙️ Section 2: Algorithms

---

### ### 2.1 **Binary Search**

* **Category**: Searching
* **Problem It Solves**: Find element in a **sorted** array
* **Logic**:

  * Repeatedly divide array in half
  * Compare mid with target
* **Approaches**:

  * **Naive**: Linear scan — O(n)
  * **Optimized (Binary Search)**: O(log n)
* **Time Complexity**:

  * Best: O(1) (element at mid)
  * Avg/Worst: O(log n)
* **Space Complexity**: O(1)
* **Use Cases**: Search in sorted data, rotated arrays, lower/upper bound

---

### ### 2.2 **Merge Sort**

* **Category**: Sorting (Divide & Conquer)
* **Logic**:

  * Recursively split array
  * Merge sorted halves
* **Time Complexity**: O(n log n)
* **Space Complexity**: O(n)
* **Use Cases**: Stable sort, linked lists

*(Continue with Quick Sort, DP, BFS, DFS, Dijkstra, Sliding Window, etc.)*

---

## 🧪 Section 3: Solved Problems Log

---

### ### 🔍 Example Entry: "Two Sum" (Leetcode #1)

* **Problem Type**: Array, Hashing
* **Difficulty**: Easy
* **Summary**: Find indices of two numbers that sum to a target.
* **Naive Approach**:

  * Brute-force nested loops.
  * **Time**: O(n²), **Space**: O(1)
* **Optimized Approach**:

  * Use a HashMap to track complements.
  * **Time**: O(n), **Space**: O(n)
* **Edge Cases**:

  * No pair exists
  * Negative numbers
* **Key Insight**: Hashing allows instant complement lookup.

---

### ### 🔍 Example Entry: "Longest Substring Without Repeating Characters"

* **Type**: Sliding Window
* **Naive**: Generate all substrings — O(n³)
* **Optimized**: Sliding window + HashSet — O(n)
* **Insight**: Track seen characters and dynamically move left pointer.

---

## 🧱 Section 4: Miscellaneous
 
---

### ### 1.1 **Java Topics**

* Classes and objects
* Interfaces
* Comparable, Comparator
* Collections and Generics
* Threads - Runnable and Callable
* Annotations and Anonymous classes
* Collectors class
* Parallel streams; streams use tree data structure upto some extent
* Async and sync functions

1. Interfaces? - Contract ; Contains Abstract, Default and Static methods
2. Functional interfaces? - Single Abstract Method; Take few examples
3. Lambdas? - Way to create objects of those classes which are implementing functional interface
   Similar to arrow functions in javascript
4. Stream? - Lazy evaluation
