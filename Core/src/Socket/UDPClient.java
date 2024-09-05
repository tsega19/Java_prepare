package Socket;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 5000;

        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buffer = "Hello from UDP client!".getBytes();

            InetAddress serverAddress = InetAddress.getByName(hostname);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, port);
            socket.send(packet); // Send the packet to the server

            byte[] responseBuffer = new byte[1024];
            DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(responsePacket); // Receive response from the server

            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Received: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
