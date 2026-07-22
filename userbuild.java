import java.io.*;
//import java.util.*;
class Myexception extends Exception {
    public Myexception(String s) {
        super(s);
    }
}
public class userbuild {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        
        try {
            int c=a/b;
            throw new Myexception("This is a custom exception");
        } catch (Exception e) {
        System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
