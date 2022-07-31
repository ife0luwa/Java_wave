package Java_Network_Programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientMajorGeneral {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8148);

            DataInputStream serverConnectionData = new DataInputStream(clientSocket.getInputStream());
            System.out.println(serverConnectionData.readUTF());

            DataOutputStream clientOutgoingData = new DataOutputStream(clientSocket.getOutputStream());

            clientOutgoingData.writeUTF("General Pepe on the line, over!");

            clientOutgoingData.flush();

//            clientOutgoingData.close();
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
