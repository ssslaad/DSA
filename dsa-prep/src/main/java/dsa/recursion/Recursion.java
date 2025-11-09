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
 *       6. 
 *       7. 
 *       8.  
 *       9.
 *      10. 
 *      11. 
 *      12.
 */
package recursion;


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
            for(Integer integ : ds){
                System.out.print(integ+ " ");
            }
            System.out.println("");
            return;
        }
        ds.add(arr[i]);
        printAllSubsequences(arr, ds, i+1);
        ds.remove();
        printAllSubsequences(arr, ds, i+1);
    }



}