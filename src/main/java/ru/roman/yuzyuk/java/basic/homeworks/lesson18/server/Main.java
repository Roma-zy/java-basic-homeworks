package ru.roman.yuzyuk.java.basic.homeworks.lesson18.server;

import ru.roman.yuzyuk.java.basic.homeworks.lesson18.server.calculator.Calculator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            try (
                    Socket clientSocket = serverSocket.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
            ) {
                String initialMessage = "Доступные операции: " + Calculator.getAvailableOperations() + "\n";
                out.write(initialMessage);
                out.flush();

                String clientMessage;
                while ((clientMessage = in.readLine()) != null) {
                    String response;
                    String[] arrRequest = clientMessage.split(" ");

                    if (arrRequest.length != 3) {
                        out.write("Введите запрос в формате 1.99 + 1.11" + System.lineSeparator());
                        out.flush();
                        continue;
                    }

                    try {
                        switch (arrRequest[1]){
                            case "-":
                                response = String.valueOf(Calculator.difference(
                                        Double.parseDouble(arrRequest[0]),
                                        Double.parseDouble(arrRequest[2])
                                ));
                                break;
                            case "+":
                                response = String.valueOf(Calculator.sum(
                                        Double.parseDouble(arrRequest[0]),
                                        Double.parseDouble(arrRequest[2])
                                ));
                                break;
                            case "/":
                                response = String.valueOf(Calculator.division(
                                        Double.parseDouble(arrRequest[0]),
                                        Double.parseDouble(arrRequest[2])
                                ));
                                break;
                            case "*":
                                response = String.valueOf(Calculator.multiplication(
                                        Double.parseDouble(arrRequest[0]),
                                        Double.parseDouble(arrRequest[2])
                                ));
                                break;
                            default:
                                response = "Введен не корректный сивол операции!";
                        }
                    } catch (NumberFormatException e) {
                        out.write("Вы ввели не число!");
                        out.flush();
                        continue;
                    }



                    response += System.lineSeparator();
                    out.write(response);
                    out.flush();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
