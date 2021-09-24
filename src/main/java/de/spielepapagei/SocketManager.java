package de.spielepapagei;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketManager {

    private String host = null;
    private int port = 0;
    private Socket socket = new Socket ();
    private String[] data =  new String[900];

    public SocketManager(String host, int port) {
        this.host = host;
        this.port = port;

        try {
            socket.connect(new InetSocketAddress(host,port));
            OutputStream out = socket.getOutputStream ();
            InputStream in = socket.getInputStream ();
            out.write(0xFE);

            int b;
            StringBuffer str = new StringBuffer();
            while((b = in.read()) != -1) {
                //https://youtu.be/oGiFnJvSf0g?t=239
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
