package Filehandling;

import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) {
        try (
                // Create a FileWriter and wrap it with a BufferedWriter
                FileWriter fw = new FileWriter("file.txt");
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String str = "Hello world";
            // Write the string to the file
            bw.write(str);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
