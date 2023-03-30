import java.util.Scanner;

public class FormatingOutput {

    public static void main(String[] args) {
        // create a new Scanner object to read input from the user
        Scanner sc=new Scanner(System.in);
        
        // print a line of equal signs to separate the output from the input
        System.out.println("================================");
        
        // loop three times to read three lines of input
        for(int i=0;i<3;i++){
            // read the first token on the line as a string
            String s1=sc.next();
            
            // read the second token on the line as an integer
            int x=sc.nextInt();
            
            // format the output string using printf, left-justifying the string in a field of 15 characters
            // and right-justifying the integer in a field of 3 digits with leading zeros if necessary
            System.out.printf("%-14s %03d \n",s1,x);
        }
        
        // print another line of equal signs to separate the output from any additional output
        System.out.println("================================");

        // close the Scanner object to prevent resource leaks
        sc.close();
    }
}
