package soket_Programming;

import java.io.IOException;
import java.net.*;
public class ServerApp{

public ServerApp() throws IOException{
ServerSocket server=new ServerSocket(2007);
System.out.println("server started....");
try{
while(true){
Socket sr=server.accept();

System.out.println("client connected...");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public static void main(String []args) throws IOException{
new ServerApp();
}
}
