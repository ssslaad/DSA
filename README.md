https://developer.ibm.com/learningpaths/java-get-started


# JAVA Topics

Classes and objects
Interfaces
Comparable, Comparator
Collections and Generics
Runnable and Callable
Annotations and Anonymous classes
Collectors class
Parallel streams; streams use tree data structure upto some extent
Async and sync functions

Scaler Master class Streams and Lambdas:

1. Interfaces? - Contract ; Contains Abstract, Default and Static methods
2. Functional interfaces? - Single Abstract Method; Take few examples
3. Lambdas? - Way to create objects of those classes which are implementing functional interface
   Similar to arrow functions in javascript
4. Stream? - Lazy evaluation


 Section 1: Data Structures
### 1.1 Array
Definition: A linear data structure where elements are stored in contiguous memory.

Types: One-dimensional, multi-dimensional

Implementation: Built-in in most languages (e.g., int arr[] = new int[5];)

Operations & Time Complexities:

Access: O(1)

Search: O(n)

Insert/Delete at end: O(1) (amortized)

Insert/Delete at start/middle: O(n)

Use Cases: Static storage, caching, fast indexing

Pros:

Constant-time access by index

Easy to implement

Cons:

Fixed size

Expensive insertions/deletions (except at the end)

### 1.2 Linked List
Definition: A linear structure where elements (nodes) point to the next node.

Types: Singly, Doubly, Circular

Implementation:

cpp
Copy
Edit
struct Node {
    int data;
    Node* next;
};
Operations & Time Complexities:

Access/Search: O(n)

Insert/Delete at head: O(1)

Insert/Delete at tail: O(1) (with tail pointer)

Use Cases: Dynamic memory, stacks, queues

Pros:

Dynamic size

Fast insertions/deletions

Cons:

No random access

Extra memory for pointers

(We'll continue similarly for Stack, Queue, Heap, Tree, Graph, HashMap, Set, Trie, etc.)

⚙️ Section 2: Algorithms
### 2.1 Binary Search
Category: Searching

Problem It Solves: Find element in a sorted array

Logic:

Repeatedly divide array in half

Compare mid with target

Approaches:

Naive: Linear scan — O(n)

Optimized (Binary Search): O(log n)

Time Complexity:

Best: O(1) (element at mid)

Avg/Worst: O(log n)

Space Complexity: O(1)

Use Cases: Search in sorted data, rotated arrays, lower/upper bound

### 2.2 Merge Sort
Category: Sorting (Divide & Conquer)

Logic:

Recursively split array

Merge sorted halves

Time Complexity: O(n log n)

Space Complexity: O(n)

Use Cases: Stable sort, linked lists

(Continue with Quick Sort, DP, BFS, DFS, Dijkstra, Sliding Window, etc.)
