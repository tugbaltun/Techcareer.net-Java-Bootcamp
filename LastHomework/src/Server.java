import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void execute() {
        try(ServerSocket listener = new ServerSocket(3000)){
            while (true){
                Socket socket = listener.accept();

                //Thread burada başlar
                UserThread user = new UserThread(socket, this);
                user.start();

                //Client'a gönderilen bilgi
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                //clientData += " geldi";
                //writer.println(clientData);

            }
        }catch (Exception e){
            System.out.println("Error:"+e.getLocalizedMessage());
        }
    }
    public static void main(String[] args){

        Server server = new Server();
        server.execute();

    }



}
