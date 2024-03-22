package org.testsocket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 6688)) {
            System.out.println("已连接到服务器!");
        } catch (IOException e) {
            System.out.println("服务器连接失败!");
            System.out.printf(e.getMessage());
        }
    }
}
