package dsa.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.*;

import recursion.Recursion;

public class RecursionTest {

    @Test
    void testprintAllSubsequences(){
        System.out.println("Testcase Start :: Print all subsequences");
        int[] arr = {5, 1, 6};
        List<Integer> ds = new ArrayList<>();

        // original sysout
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Recursion.printAllSubsequences(arr, ds, 0);

        // Restore original System.out
        System.setOut(originalOut);

        // Convert captured output to string
        String output = outputStream.toString().trim();

        // Expected subsequences (order matters based on your recursion)
        String expected =
                "[5, 1, 6]\n" +
                "[5, 1]\n" +
                "[5, 6]\n" +
                "[5]\n" +
                "[1, 6]\n" +
                "[1]\n" +
                "[6]\n" +
                "[]";

        assertEquals(expected, output);
        System.out.println("Testcase End :: Print all subsequences");
    }

}
