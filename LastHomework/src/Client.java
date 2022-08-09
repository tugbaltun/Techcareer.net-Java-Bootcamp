import java.io.*;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Client {

    private static Scanner scanner = new Scanner(System.in);
    private static String server;
    private static int port;
    private static String userName;

    public void execute(){
        try(Socket socket = new Socket(server, port)){
            System.out.println("Connected to the server..."+socket.toString());

            WriteThread writeThread = new WriteThread(socket, this);
            writeThread.start();

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader((new InputStreamReader(input)));
            String gdata = reader.readLine();
            System.out.println(gdata);

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("A file was sent to you by the server!");
        }
    }
    public static void main(String[] args){

        if(args.length > 1){
            server = args[0];
            port = parseInt(args[1]);
        }else{
            System.out.print("Enter server URL:");
            server = scanner.nextLine();
            System.out.print("Enter the server port number:");
            port = parseInt(scanner.nextLine());
        }

        Client client = new Client();
        client.execute();

    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

}
