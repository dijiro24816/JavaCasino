import java.io.*;
import java.net.*;

// 

class Dealer {
    
}

class Player {

}

class Table {

}

public class Server {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // SocketAddress sock_addr = new InetSocketAddress("127.0.0.1", 8080);
        ServerSocket serv_sock = new ServerSocket(8080, 2, InetAddress.getByName("127.0.0.4"));

        Socket sock = serv_sock.accept();
        BufferedInputStream in = new BufferedInputStream(sock.getInputStream());

        int ch;
        while ((ch = in.read()) > 0) {
            System.out.print((char)ch);
        }
    }
}