package org.mysocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)  {

        System.out.println("你好...");

        try(ServerSocket server = new ServerSocket(6688)) {
            System.out.println("正在等待客户端连接:");
            Socket socket = server.accept(); //当没有客户端连接时，线程会阻塞
            System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());
        }catch (IOException e) {
            System.out.printf(e.getMessage());
        }

    }
}