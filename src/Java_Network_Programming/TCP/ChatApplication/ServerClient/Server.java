package Java_Network_Programming.TCP.ChatApplication.ServerClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket myServer = new ServerSocket(2022)) {

            /* create an infinite loop to read data input continuously until data input equals "exit" */
            while (true) {
                Socket socketServing = myServer.accept();
                System.out.println("client connected");

                Echoer echoer = new Echoer(socketServing);
                echoer.start();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
