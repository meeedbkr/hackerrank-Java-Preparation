// This line imports the java.util package which contains the Scanner class
import java.util.*;

// This line declares a public class named "InOut"
public class InOut {
    
    // This line declares the main method which takes an array of strings as an argument
    public static void main(String[] args) {
        
        // This line creates a new instance of the Scanner class to read input from the console
        Scanner scan = new Scanner(System.in);
        
        // This line reads an integer input from the console and assigns it to the variable "a"
        int a = scan.nextInt();
        
        // This line reads another integer input from the console and assigns it to the variable "b"
        int b = scan.nextInt();
        
        // This line reads a third integer input from the console and assigns it to the variable "c"
        int c = scan.nextInt();
        
        // This line prints the value of "a" to the console
        System.out.println(a);
        
        // This line prints the value of "b" to the console
        System.out.println(b);
        
        // This line prints the value of "c" to the console
        System.out.println(c);
    }
}
