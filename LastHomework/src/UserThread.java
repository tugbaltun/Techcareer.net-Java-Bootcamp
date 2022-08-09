import java.io.*;
import java.net.Socket;
import java.util.Locale;

public class UserThread extends Thread{
    private Socket socket;
    private Server server;

    private final String filePath = "C:\\Users\\Tugba\\Desktop\\SendingFile\\example.txt";

    public UserThread(Socket socket, Server server){
        this.server = server;
        this.socket = socket;
    }

    public void run(){
        try{
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String userName = reader.readLine(), serverMessage;
            System.out.println(socket.toString());
            System.out.println("'"+userName+"' has connected to the server!");


            byte[] buffer = new byte[2002];
            FileInputStream fileInputStream = new FileInputStream(filePath);
            fileInputStream.read(buffer,0,buffer.length);
            OutputStream dataOutputStream = socket.getOutputStream();
            dataOutputStream.write(buffer,0,buffer.length);

            serverMessage = "File was sent to user ["+userName+"]!";
            System.out.println(serverMessage);

            serverMessage = "[" +userName + "] has left the server!";
            System.out.println(serverMessage);
            socket.close();

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }


}
