package dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    // public static void main(String args[]) {
    //     int[] arr = { 5, 1, 6, 2, 3, 4, 7 };
    //     // before sorting
    //     System.out.println("Before Sorting");
    //     printArray(arr);
    //     SortingAlgorithms.classicInsertionSort(arr, 0, arr.length - 1);
    //     System.out.println("After Sorting");
    //     printArray(arr);
    // }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ,");
        }
        System.out.println("");
    }
}
