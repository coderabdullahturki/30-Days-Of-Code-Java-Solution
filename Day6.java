import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < testCase; i++){
            String myString = sc.nextLine();
            char[] myArray = myString.toCharArray();

            for(int j=0; j<myString.length(); j++){
                if(j % 2 == 0){
                    System.out.print(myArray[j]);
                }

            }
            System.out.print(" ");

            for(int j=0; j<myString.length(); j++){
                if(j % 2 != 0){
                    System.out.print(myArray[j]);
                }

            }

            System.out.println();
        }


 }
}
