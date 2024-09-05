package Protocol;

import java.io.*;
import java.net.*;

public class SimpleHTTPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server is listening on port 8080");

        while (true) {
            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            // Get input stream to read the request
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // Read the request line (e.g., "GET / HTTP/1.1")
            String requestLine = reader.readLine();
            System.out.println("Request: " + requestLine);
            // Read and discard headers (for simplicity)
            while (!reader.readLine().isEmpty()) {
                // You can also parse the headers here if necessary
            }
            // Generate an HTTP response
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());

            String httpResponse = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: 72\r\n" +
                    "\r\n" +
                    "<html><body><h1>Hello from the Simple Java HTTP Server!</h1></body></html>";

            // Send the response
            writer.write(httpResponse);
            writer.flush();

            // Close the client connection
            clientSocket.close();
        }
    }
}
