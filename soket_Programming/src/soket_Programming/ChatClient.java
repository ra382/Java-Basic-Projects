package soket_Programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static Scanner sce = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Socket sc = new Socket("localhost",2007);
			DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
			while(true)
			{
				
				try {
					System.out.print("Client Enter UR msg");
					dos.writeUTF(sce.nextLine());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
