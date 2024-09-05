package Socket;

import java.io.IOException;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        int port = 5000;

        try (DatagramSocket socket = new DatagramSocket(port)) {
            byte[] buffer = new byte[1024];

            System.out.println("UDP Server is listening on port " + port);

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet); // Receive a packet from the client

            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + received);

            String response = "Hello from UDP server!";
            byte[] responseBytes = response.getBytes();

            // Send response to client
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();
            DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, clientAddress, clientPort);
            socket.send(responsePacket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
