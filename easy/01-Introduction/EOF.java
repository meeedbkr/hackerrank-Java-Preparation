import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        
        // read input from the user until there is no more input
        do {
            String s = sc.nextLine();
            list.add(s); // add each input to the list
        } while(sc.hasNext());
        
        sc.close(); // close the scanner
        
        // print the list with a line number for each element
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }
    }
}
