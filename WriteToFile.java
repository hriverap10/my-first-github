import java.io.*;

public class WriteToFile {
    public static void main (String [] args) {
        try {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println("Hello World!");
        pw.close();
        } catch(FileNotFoundException e) {
            System.out.println("Something went wrong writing the output.txt.");
        }
    }
}
