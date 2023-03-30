import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LoopsI {
    public static void main(String[] args) throws IOException {
        // Create a new BufferedReader object to read input from the console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the user and trim whitespace from the input
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Print the multiplication table for N up to 10
        for(int i = 1; i <= 10; i++){
            // Multiply N by the current value of i and print the result along with the current values of N and i
            System.out.println(N + " x " + i + " = " + N * i);
        }

        // Close the BufferedReader
        bufferedReader.close();
    }
}
