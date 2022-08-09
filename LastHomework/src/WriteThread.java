import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread {
    private PrintWriter writer;
    private Socket socket;
    private Client client;

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
        System.out.println("WriteThread is started!");
        System.out.println("Enter your userName:");

        String text, userName;
        userName = scanner.nextLine();
        client.setUserName(userName);
        writer.println(userName);

        byte b[] = new byte[2002];
        InputStream input = socket.getInputStream();
        FileOutputStream output = new FileOutputStream("C:\\Users\\Tugba\\Desktop\\exampleBackup.txt");
        input.read(b, 0, b.length);
        output.write(b, 0, b.length);

/*      do{
            System.out.print("["+userName+"]:");
            text = scanner.nextLine();
            writer.println(text);
        }while (!text.contains("bye"));*/

        socket.close();

        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
