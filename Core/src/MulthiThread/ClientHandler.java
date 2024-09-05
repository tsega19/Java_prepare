package MulthiThread;


import javax.imageio.IIOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientHandler {
    private Socket clientSocket;

    public ClientHandler(Socket socket){
        this.clientSocket= socket;
    }


    public void run(){
        try {
            InputStream input =clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String message = reader.readLine();
            System.out.println("Received from client: " + message);

            writer.println("Hello from server!");

            clientSocket.close();
        }catch (IIOException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class MultiThreadedServer {
    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

//                 Create a new thread for each client
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                Thread thread = new Thread((Runnable) clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}