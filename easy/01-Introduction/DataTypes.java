import java.util.*;
import java.io.*;

class DataTypes{
    public static void main(String []argh)
    {
        // Create a new Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases from the user
        int t=sc.nextInt();

        // Iterate over each test case
        for(int i=0;i<t;i++)
        {
            try
            {
                // Read a long integer from the user
                long x=sc.nextLong();

                // Print the input value and a message indicating which data types it can be stored in
                System.out.println(x+" can be fitted in:");

                // Check if the input value can be stored in a byte
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }

                // Check if the input value can be stored in a short
                if(x>=-32768 && x<=32767 ) {
                    System.out.println("* short");
                }

                // Check if the input value can be stored in an int
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1) {
                    System.out.println("* int");
                }

                // Check if the input value can be stored in a long
                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                // If the input value is too large to be stored in any data type, print an error message
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
