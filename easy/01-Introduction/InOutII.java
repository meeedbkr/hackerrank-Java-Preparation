import java.util.Scanner; // import the Scanner class

public class InOutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create a new Scanner object to read user input from the console

        int i = scan.nextInt(); // read the first integer entered by the user
        scan.nextLine(); // consume the newline character left by scan.nextInt()

        double d = scan.nextDouble(); // read the first double entered by the user
        scan.nextLine(); // consume the newline character left by scan.nextDouble()

        String s = scan.nextLine(); // read the first string entered by the user

        System.out.println("String: " + s); // print the string entered by the user
        System.out.println("Double: " + d); // print the double entered by the user
        System.out.println("Int: " + i); // print the integer entered by the user
    }
}
