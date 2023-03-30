import java.util.*;
import java.security.*;

public class IntToString {
    public static void main(String[] args) {
        // Create an instance of the DoNotTerminate class to prevent termination of the program using System.exit()
        DoNotTerminate.forbidExit();

        try {
            // Create a scanner to read an integer input from the user
            Scanner in = new Scanner(System.in);

            // Read the integer input and store it in a variable
            int n = in.nextInt();

            // Close the scanner to avoid resource leakage
            in.close();

            // Convert the integer to a string
            String s = String.valueOf(n);

            // Check if the integer and the string representation are equal
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class will prevent you from terminating the code using System.exit()
class DoNotTerminate {
    // A custom exception to be thrown if the program attempts to exit
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        // Create a new SecurityManager instance to prevent the use of System.exit()
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                // Throw an exception if the permission being checked contains the word "exitVM"
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };

        // Set the SecurityManager to the newly created instance
        System.setSecurityManager(securityManager);
    }
}
