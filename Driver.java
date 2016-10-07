import java.io.IOException;

/**
 * Created by Nadeen Saleh on 6/9/16.
 *
 * @author Nadeen Saleh
 * @version 6/9/16
 */
public class Driver {

    public static void main(String[] args) {
        try {
            KnockKnockServer myServer = new KnockKnockServer();
            KnockKnockClient myClient = new KnockKnockClient();
            Thread thread1 =  new Thread(() -> {
                try {
                    myServer.go();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread1.start();
            myClient.send("I am talking to the server!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
