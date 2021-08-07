package soket_Programming;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
	private ServerSocket server;
	

public ChatServer()
{
try
{
server = new ServerSocket(2007);
while(true)
{
	
	Socket soc = server.accept();
	DataInputStream dis = new DataInputStream(soc.getInputStream());
	String s = dis.readUTF();
	System.out.println("Msg from Client"+s);
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}

	public static void main(String[] args) {
		new ChatServer();
	}
}
