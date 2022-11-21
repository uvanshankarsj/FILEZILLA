import java.io.IOError;
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;

public class ftpserver {   
    public static void main(String [] args) throws IOException{
        ServerSocket ss= new ServerSocket(5000);
        Socket s=ss.accept();
        DataInputStream str=new DataInputStream(s.getInputStream());
        String ans="";
        FileWriter fr=new FileWriter("test2.txt");     
        // Scanner sc = new Scanner(fr);
        while(ans.compareTo("bye")!=0){
            ans=(String)str.readUTF();
            fr.write(ans);
            fr.write("\n");
        }
        fr.close();
        s.close();
        ss.close();
}
}
