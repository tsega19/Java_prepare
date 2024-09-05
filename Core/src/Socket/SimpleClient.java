package Socket;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server's hostname
        int port = 5000; // Server's port

        try (Socket socket = new Socket(hostname, port)) {
            // Get input and output streams to communicate with the server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Send a message to the server
            writer.println("Hello from client!");

            // Read response from the server
            String response = reader.readLine();
            System.out.println("Received from server: " + response);

        } catch (UnknownHostException e) {
            System.err.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
