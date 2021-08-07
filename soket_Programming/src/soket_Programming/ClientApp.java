package soket_Programming;

import java.net.Socket;
public class ClientApp{
private Socket soc;
public ClientApp(){
try{
soc=new Socket("192.168.10.107",2007);
String s = soc.getInputStream();
}
catch(Exception ex){
System.out.println(ex);
}
}
public static void main(String[]args){
new ClientApp();
}
}
