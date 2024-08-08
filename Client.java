import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket(InetAddress.getByName("127.0.0.1"), 8080);

        PrintWriter writer = new PrintWriter(sock.getOutputStream());
        writer.print("hello ryuichi");
        writer.flush();
    }
}