import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Nadeen Saleh on 6/9/16.
 *
 * @author Nadeen Saleh
 * @version 6/9/16
 */
public class KnockKnockServer {

    private ServerSocket myServerSocket;

    public KnockKnockServer() throws IOException {
        myServerSocket = new ServerSocket(9000);
    }

    public void go() throws IOException {
        // The client that connected to my server
        Socket clientSocket = null;
        clientSocket = myServerSocket.accept();

        // Scanner allows for getInputStream to be workable
        Scanner s = new Scanner(clientSocket.getInputStream());

        while (s.hasNext()){
            System.out.println(s.next());
        }

        s.close();
    }

}
