import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int temp= 0, rem = 0, maxCount = 0;

        while(n>0){
            rem = n%2;
            n = n/2;

            if(rem == 1){
                temp++;

                if(temp>maxCount){
                    maxCount = temp;
                }
            }else {
                temp = 0;
            }
        }
        System.out.println(maxCount);


        scanner.close();
    }
}
