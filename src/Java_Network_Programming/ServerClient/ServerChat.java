package Java_Network_Programming.ServerClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args) {
        try(ServerSocket myChatServer = new ServerSocket(4242)) {
            while(true) {
                Socket chatServerSocket = myChatServer.accept();
                System.out.println("Thread connected");
                ChatReceiverThread chatReceiverThread = new ChatReceiverThread(chatServerSocket);
                chatReceiverThread.start();

                ChatSenderThread chatSenderThread = new ChatSenderThread(chatServerSocket);
                chatSenderThread.start();
                try{
                    chatSenderThread.join();
                } catch (InterruptedException e) {
                    e.getMessage();
                }

            }

        }catch (IOException e) {
            e.getMessage();
        }
    }
}
