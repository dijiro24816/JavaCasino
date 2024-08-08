import java.io.*;
import java.net.*;
import java.util.*;

// // 

// class Dealer {
    
// }

// class Player {

// }

// class Table {

// }

public class Server {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // SocketAddress sock_addr = new InetSocketAddress("127.0.0.1", 8080);
        ServerSocket serv_sock = new ServerSocket(8080, 2, InetAddress.getByName("127.0.0.1"));
        Socket sock = serv_sock.accept();
        BufferedInputStream in = new BufferedInputStream(sock.getInputStream());

        try {
        int ch;
        while ((ch = in.read()) > 0) {
            System.out.print((char)ch);
        }
        } catch (SocketException e) {
            System.out.println("エラー発生");
        } finally {
            System.out.println();
        }
    }
}