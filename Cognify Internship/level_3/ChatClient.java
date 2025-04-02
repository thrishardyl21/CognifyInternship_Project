import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ChatClient{
    private static final String SERVER_ADDRESS="localhost";
    private static final int SERVER_PORT=12345;
    public static void main(String[] args){
        try(Socket socket=new Socket(SERVER_ADDRESS,SERVER_PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        Scanner scanner=new Scanner(System.in)){
            Thread listener=new Thread(()->{
                try{
                    String serverMessage;
                    while((serverMessage=in.readLine())!=null){
                        System.out.println("Server:" + serverMessage);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            });
            listener.start();
            System.out.println("Connected to chatServer, Type your messages:");
            while(scanner.hasNextLine()){
                out.println(scanner.nextLine());
            }
            } catch(IOException e){
                e.printStackTrace();
        }
    }
}