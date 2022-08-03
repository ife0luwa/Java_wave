package Java_Network_Programming.TCP.ChatApplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MilitaryServer {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(8148);

            /* Create a socket to accept incoming signal(socket) */
            Socket serverSocket = server.accept();
            System.out.println("Server created and running" + "\n");

            /* Create a broadcast message for the server */
            DataOutputStream serverBroadcastMessage = new DataOutputStream(serverSocket.getOutputStream());
            serverBroadcastMessage.writeUTF("Welcome to the Naked Wolfe Battalion");

            DataInputStream serverIncomingData = new DataInputStream(serverSocket.getInputStream());

            String message = serverIncomingData.readUTF(); /* experiment with other methods */

            System.out.println("message: " + message);

            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
