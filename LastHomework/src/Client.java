import java.io.*;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Client {

    private static Scanner scanner = new Scanner(System.in);
    private static String server;
    private static int port;
    private static String serverData;
    private static String userName;

    private static boolean closed;

    public void execute(){
        try(Socket socket = new Socket(server, port)){
            System.out.println("Connected to the server..."+socket.toString());

            WriteThread writeThread = new WriteThread(socket, this);
            writeThread.start();

            //Server'a giden bilgi
 //           OutputStream output = socket.getOutputStream();
 //           PrintWriter writer = new PrintWriter(output, true);
 //           writer.println(serverData);

            //Server'dan gelen bilgi
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader((new InputStreamReader(input)));
            String gdata = reader.readLine();
            System.out.println(gdata);

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("Process is finished.");
        }
    }
    public static void main(String[] args){

        if(args.length > 1){
            server = args[0];
            port = parseInt(args[1]);
        }else{
            System.out.println("Enter server URL:");
            server = scanner.nextLine();
            System.out.println("Enter the server port number:");
            port = parseInt(scanner.nextLine());
        }

        System.out.println("Enter your text:");
        serverData = scanner.nextLine();

        Client client = new Client();
        client.execute();

    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setClosed(boolean closed){
        this.closed = closed;
    }

    public boolean getClosed(){
        return this.closed;
    }
}
