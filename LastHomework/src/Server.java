import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void execute() {
        try(ServerSocket listener = new ServerSocket(3000)){
            while (true){
                Socket socket = listener.accept();
                UserThread user = new UserThread(socket, this);
                user.start();

            }
        }catch (Exception e){
            System.out.println("Error:"+e.getLocalizedMessage());
        }finally {
            System.out.println("You sent a file to the client.");
        }
    }
    public static void main(String[] args){

        Server server = new Server();
        server.execute();

    }

}
