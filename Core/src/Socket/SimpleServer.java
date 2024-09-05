package Socket;
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 5000; // The port on which the server will listen
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Get input and output streams to read from and write to the client
            InputStream input = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Read message from client and respond
            String message = reader.readLine();
            System.out.println("Received from client: " + message);
            writer.println("Hello from server!");

            // Close the connection
            clientSocket.close();
            System.out.println("Client disconnected");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
