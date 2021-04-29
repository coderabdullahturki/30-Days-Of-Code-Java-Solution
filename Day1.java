import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String inputStr = scan.nextLine();



        System.out.println(i + a);

        /* Print the sum of the double variables on a new line. */

        System.out.println(d + b);
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.println(s + inputStr);


        scan.close();
    }
}