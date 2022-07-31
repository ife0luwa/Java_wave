package Java_Network_Programming.ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatReceiverThread extends Thread{
    private Socket receiveSocket;

    public ChatReceiverThread(Socket receiveSocket) {
        this.receiveSocket = receiveSocket;
    }

    @Override
    public void run() {
        try (BufferedReader inputData = new BufferedReader(new InputStreamReader(receiveSocket.getInputStream()))) {
            while (true) {
                String incomingMessage = inputData.readLine();
                System.out.println(ChatColor.ANSI_CYAN + "New message: " + incomingMessage);
                Thread.sleep(500);
            }
        } catch (IOException e) {
            e.getMessage();
        } catch (InterruptedException e) {
            e.getMessage();
        }

    }
}
