package Java_Network_Programming.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(4184);
            while (true) {
                byte [] buffer = new byte[40];
                DatagramPacket serverPacket = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(serverPacket);
                System.out.println("Received text: " + new String(buffer,0, serverPacket.getLength()));
            }


        } catch (SocketException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
