package dsa.recursion;

public class RecursionTest {

    @Test
    void testprintAllSubsequences(){
        System.out.println("Testcase Start :: Print all subsequences");
        int[] arr = { 5, 1, 6 };
        List<Integer> ds = new ArrayList<>();
        Recursion.printAllSubsequences(arr, ds, 0);
        assertArrayEquals(new int[]{5, 1, 6}, arr);
        System.out.println("Testcase End :: Print all subsequences");
    }

}
