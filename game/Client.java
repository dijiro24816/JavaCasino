package game;

import java.io.*;
import java.net.*;

// class CommandReceiver {
//     InputStream strm;
//     public CommandReceiver(InputStream strm) {
//         this.strm = strm;
//     }
//     public Command receive() {
//         // extract player
//         // extract command
//     }
// }

// class CommandSender {
//     OutputStream strm;
//     public CommandSender(OutputStream strm) {
//         this.strm = strm;
//     }
//     public void send(Command cmd) {

//     }

// }

// CommandString(InputStream strm)
// CommandBinary(InputStream strm)

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // Socket sock = new Socket("127.0.0.2", 8080);
        // System.out.println(sock.isConnected());
        // PrintWriter out = new PrintWriter(sock.getOutputStream());
        // out.println("hello");
        // out.flush();

        Operation ops = new game.command.operations.ReceivingClient(new Room());
    }
}