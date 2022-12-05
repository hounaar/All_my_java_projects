package programin.desktop.java.koligari;
import java.net.*;
import java.io.*;
public class ClientProgram
{
// initialize socket and input output streams
private Socket socket = null;
private DataInputStream input = null;
private DataOutputStream out = null;
// constructor to put ip address and port
public ClientProgram(final String address, final int port) {
    // establish a connection
    try {
        socket = new Socket(address, port);
        System.out.println("Connected");
        // takes input from terminal
        input = new DataInputStream(System.in);
        // sends output to the socket
        out = new DataOutputStream(socket.getOutputStream());
    } catch (final UnknownHostException u) {
        System.out.println(u);
    } catch (final IOException i) {
        System.out.println(i);
    } // string to read message from input
    String line = "";
    // keep reading until "Over" is input
    while (!line.equals("Over")) {
        try {
            line = input.readLine();
            out.writeUTF(line);
        } catch (final IOException i) {
            System.out.println(i);
        }
    }
    // close the connection
    try {
        input.close();
        out.close();
        socket.close();
    } catch (final IOException i) {
        System.out.println(i);
    }
}

public static void main(final String args[]) {
    final ClientProgram clientpr = new ClientProgram("127.0.0.1", 5000);
}
}