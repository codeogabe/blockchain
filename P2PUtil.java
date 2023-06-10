import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;


/**
 * This class holds any utility methods needed for P2P networking communication.
 */
public class P2PUtil {


    /**
     * Allows a one time socket call to a server, gets reply, and then closes connection.
     * @param sIP
     * @param iPort
     * @param sMessage
     * @return
     */
    public static String connectForOneMessage(String sIP, int iPort, String sMessage){
        try(Socket oSocket = new Socket()) {

            //Connect
            oSocket.connect(new InetSocketAddress(sIP,iPort), 5000);

            //Write
            OutputStream output = oSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output,true);

            //Message
            writer.println(sMessage);

            //Listen
            InputStream input = oSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            //Reply to stream
            String sReturned = reader.readLine();
            return sReturned;

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }
}
