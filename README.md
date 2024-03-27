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


# DSA Topics

## Sorting:
Reference links:
https://www.geeksforgeeks.org/sorting-algorithms/

### 1. Insertion Sort - get current index value and try to fit it in sorted manner before the current index (which are already sorted).
Best case - O(n)
Worst Case - O(n^2)

Optimizing algorithm -
If we can use binary search to identify the location of current element, we can reduce worst case time complexity to O(n.logn)

### 2. Selection Sort - Find the smallest number and place it at the very start of the array, then increase the head/start pointer by 1 and repeat.