import java.util.*;
import java.io.*;

class LoopsII{
    public static void main(String []argh){
        // Create a new Scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Read the number of test cases from the user
        int t = in.nextInt();

        // Iterate over each test case
        for(int i=0;i<t;i++){
            // Read the starting values for a, b, and n for the current test case
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Calculate the first value in the series
            int s = a;

            // Iterate over each number in the series
            for(int j=0;j<n;j++){
                // Calculate the next number in the series and add it to s
                s += b*Math.pow(2,j);

                // Print the current value of s
                System.out.print(s);

                // If we haven't printed the last number in the series yet, print a space after s
                if (j != (n-1)) {
                    System.out.print(" ");
                }
            }

            // Print a newline after the series is complete
            System.out.println();
        }

        // Close the Scanner object
        in.close();
    }
}
