package EchoServer.java;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) throws Exception {

        String host = "127.0.0.1";
        short port = 6666;
        ServerSocket server = null;


        try {
            server = new ServerSocket(port, 0, InetAddress.getByName(host));

            System.err.println("Listening on IP: " + host + " \n Port:" + port + "\n");
            int read = 0;
            byte[] buffer = new byte[8192];

            while(true) {
                PrintWriter out = null;
                try {
                    Socket client = server.accept();
                    System.out.println("Connection accepted from " + client.getRemoteSocketAddress());
                    out = new PrintWriter(client.getOutputStream(), true);
                    InputStream in = client.getInputStream();
                    System.out.write(buffer, 0, (read = in.read(buffer)));
                    System.out.println("");
                    String output = "Hey Good Looking";
                    out.println("HTTP/1.1 200 OK " + output.length() + " " + output);
                    out.close();
                    in.close();
                    client.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                finally {
                    if (out != null) {
                        out.flush();
                    }
                }
            }
        }
        finally {
            System.out.println("Closing");
            if(server != null)
                server.close();
        }



    }
}