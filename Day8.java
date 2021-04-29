
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> contacts = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contacts.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(contacts.containsKey(s)){
                System.out.println(s + "=" + contacts.get(s));
            } else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}