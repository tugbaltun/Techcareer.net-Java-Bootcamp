import java.io.*;
import java.net.Socket;
import java.util.Locale;

public class UserThread extends Thread{
    private Socket socket;
    private Server server;

    public UserThread(Socket socket, Server server){
        this.server = server;
        this.socket = socket;
    }

    public void run(){
        try{
            System.out.println("User thread has been started for the client");
            //Client'tan, gelen bilgi
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String userName = reader.readLine();
            System.out.println(socket.toString());
            System.out.println("'"+userName+"' has connected to the server!");


            String serverMessage;

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Tugba\\Desktop\\example.txt");
            byte b[] = new byte[2002];
            fileInputStream.read(b, 0, b.length);
            OutputStream output = socket.getOutputStream();
            output.write(b, 0, b.length);

 /*           do{
                clientMessage = reader.readLine();
                serverMessage = "["+userName+"]:"+clientMessage;
                System.out.println(serverMessage);
            }while(!clientMessage.toLowerCase().contains("bye"));*/

            serverMessage = userName + " has left the server!";
            System.out.println(serverMessage);
            socket.close();

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }


}
