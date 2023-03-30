// These lines import several Java libraries that will be used in the code
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// This line declares a public class named "IfElse"
public class IfElse {

    // This line declares a private static final Scanner object named "scanner" that reads input from the console
    private static final Scanner scanner = new Scanner(System.in);

    // This line declares the main method which takes an array of strings as an argument
    public static void main(String[] args) {
        
        // This line reads an integer input from the console and assigns it to the variable "N"
        int N = scanner.nextInt();
        
        // This line skips any remaining input after the integer input (useful when reading input with Scanner)
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // This line checks if "N" is odd, and if so, prints "Weird" to the console
        if (N%2==1) System.out.print("Weird");
        else{
            // If "N" is even, this block of code checks its value and prints "Weird" or "Not Weird" accordingly
            if( N>=2 && N<6 ) System.out.print("Not Weird");
            else if( N>=6 && N<=20 ) System.out.print("Weird");
            else if( N>20 ) System.out.print("Not Weird");
        }
        
        // This line closes the Scanner object
        scanner.close();
    }
}
