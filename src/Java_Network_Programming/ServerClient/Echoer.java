package Java_Network_Programming.ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Echoer extends Thread{
    private Socket echoerSocket;

    public Echoer(Socket echoerSocket) {
        this.echoerSocket = echoerSocket;
    }

    @Override
    public void run() {
        try {

            while(true) {
            BufferedReader inputData = new BufferedReader(new InputStreamReader(echoerSocket.getInputStream()));
            PrintWriter outputData = new PrintWriter(echoerSocket.getOutputStream(), true);
                String textToEcho = inputData.readLine();
                System.out.println(textToEcho);
                if(textToEcho.equals("exit")) {
                    break;
                }
                Scanner scanner = new Scanner(System.in);
                System.out.print("input server message: ");
                String texto = scanner.nextLine();
                outputData.println("message from server: " + texto);
            }
        } catch (IOException e) {
            System.out.println("Oops " + e.getMessage());
        } finally {
            try{
                echoerSocket.close();
            } catch (IOException e) {

            }
        }
    }



}
