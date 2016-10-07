import java.io.*;
import java.net.Socket;
import java.sql.Timestamp;

/**
 * Created by Nadeen Saleh on 6/9/16.
 *
 * @author Nadeen Saleh
 * @version 6/9/16
 */
public class KnockKnockClient {

    private static final String host = "127.0.0.1";
    private static final int port = 9000;
    private Socket myClientSocket;

    public KnockKnockClient() throws IOException {
        myClientSocket = new Socket(host, port);
    }

    public void send(String input) throws IOException {
        PrintWriter request = new PrintWriter(myClientSocket.getOutputStream());
        request.println(input);
        request.close();
    }

}
