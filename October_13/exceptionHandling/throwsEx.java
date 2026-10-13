package October_13.exceptionHandling;
/*
The throws keyword is used in a method declaration to indicate that the method may throw one or more exceptions.

 */
import java.io.*;

public class throwsEx {

    static void readFile() throws IOException{
        FileReader file = new FileReader("data.txt");
        System.out.println("File is available.");
    }
    
    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace(); // no such file or directory
        }
    }
}
