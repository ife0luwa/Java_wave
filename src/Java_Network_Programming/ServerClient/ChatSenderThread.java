package Java_Network_Programming.ServerClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatSenderThread extends Thread {
    private Socket senderSocket;

    public ChatSenderThread(Socket senderSocket) {
        this.senderSocket = senderSocket;
    }

    @Override
    public void run() {
        try (PrintWriter outgoingData = new PrintWriter(senderSocket.getOutputStream(), true)) {
            while (true) {
                Scanner sender = new Scanner(System.in);
                System.out.print(ChatColor.ANSI_PURPLE + "Input your message: " );
//                System.out.println();

                String message = sender.nextLine();
                outgoingData.println(message);
            }
        }catch (IOException e) {
            e.getMessage();
        }
    }
}
