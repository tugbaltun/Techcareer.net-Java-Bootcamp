import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread {
    private PrintWriter writer;
    private Socket socket;
    private Client client;

    private final String filePath = "C:\\Users\\Tugba\\Desktop\\ReceivingFile\\exampleNew.txt";

    public WriteThread(Socket socket, Client client){
        this.socket = socket;
        this.client = client;

        try{
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public void run(){
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");

        String userName;
        userName = scanner.nextLine();
        client.setUserName(userName);
        writer.println(userName);

        byte[] buffer = new byte[2002];
        InputStream dataInputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        dataInputStream.read(buffer,0,buffer.length);
        fileOutputStream.write(buffer,0,buffer.length);

        socket.close();

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
