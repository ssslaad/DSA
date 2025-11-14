/**
 * Recursion -> 
 *  Calling self again for smaller subproblem
 *      Parameterised Recursion -> Function calling itself and passing the result calculated to next function call.
 *          f(n,result) = f(n-1,result)
 *      Functional Recursion -> Function calling itself but results are returned directly. 
 *          f(n) = n*f(n-1)
 *  Used in substring / subsequences -> Along with (Power Set Algorithm)
 *  Every operation which a loop can do, can be done using recursion. Ex - Reversing an array, Factorial, Palindrome, Fibonacci
 *  Multiple Recursion calls 
 *       => Fibonacci series f(n) = f(n-1) + f(n-2), we are calling same function twice from inside a function
 *          This will be 2^n (exponential time complexity)
 *  Questions
 *       1. Reversing an array
 *       2. Factorial
 *       3. Palindrome
 *       4. Fibonacci
 *       5. Print all subsequences (2 Possible options - Power set algorithm OR Bit Manipulation and calculation)
 *       6. Print all subsequences with K sum 
 *              -> Maintain sum variable along with DS
 *       7. Print any subsequence with K sum 
 *              -> once printed return true and don't proceed
 *       8. Print total no. of subsequences with K sum (Count the subsequences) 
 *              -> return 1 if condition satisfies, return 0 if condition not satisfied
 *       9. Merge Sort
 *              O(n x log2 n) -> nlogn, extra temp space is needed
 *              -> Uses temporary array for storing result temporarily
 *              -> divide the array HYPOTHETICALLY in left and right part
 *              -> sort left subarray, sort right subarray 
 *              -> merge left, right using 2 pointer approach 
 *              -> Corner case -> If any of the left/right subarray exhaust, just copy the other subarray
 *      10. Quick Sort
 *              -> PARTITION INDEX
 *              O(n x log2 n) -> nlogn, NO EXTRA SPACE is needed
 *              -> Pick a pivot (generally 1st) and place it in correct position
 *              -> Smaller on the left, larger on the right of the pivot
 *              -> low, high, i, j, pivot
 *      11. 
 *      12.
 *      13.
 *      14.
 *      15.
 * 
 */
package recursion;

import java.util.*;

public class Recursion{
    
    // if n == 3, print from 001 to 999
    public void printNumbersOfNDigits(int n){

    }

    public void reverseArray(int[] arr, int n){
        
    }

    public static void printAllSubsequences(int[] arr, List<Integer> ds, int i){
        // 2^n combinations are formed for sequence of length n
        // {1,2,3} -> {}, {1}, {2}, {3}, {1,2}, {1.3}, {2,3}, {1,2,3} 
        // either take the digit, or don't take the digit
        if(i>=arr.length){
            System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        printAllSubsequences(arr, ds, i+1);
        ds.removeLast();
        printAllSubsequences(arr, ds, i+1);
    }



}