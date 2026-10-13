package October_13.exceptionHandling;

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
            System.out.println("Could not find the file." + e.getMessage()
        ); // no such file or directory
        }
    }
}
