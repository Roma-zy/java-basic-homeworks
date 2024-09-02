package ru.roman.yuzyuk.java.basic.homeworks.lesson18.client;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8080);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String request;
            String serverResponse;

            serverResponse = in.readLine();
            System.out.println("Ответ сервера: " + serverResponse);

            while (true) {
                request = userInput.readLine();
                out.write(request + System.lineSeparator());
                out.flush();

                serverResponse = in.readLine();
                System.out.println(serverResponse);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
