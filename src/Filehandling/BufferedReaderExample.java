package Filehandling;
import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) {
        try (
                // Create a FileReader and wrap it with a BufferedReader
                FileReader fr = new FileReader("file.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            // Read and print each line from the file
            while ((line= br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

