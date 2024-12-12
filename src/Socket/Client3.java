package Socket;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            Scanner scn = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a message: ");
                String message = scn.nextLine();
                pw.println(message);
                String serverMessage = reader.readLine();
                System.out.println("Server: " + serverMessage);
                if (message.equalsIgnoreCase("bye") || serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}