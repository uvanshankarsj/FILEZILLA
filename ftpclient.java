import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class ftpclient{
   public static void main(String[] args) throws IOException{
        Socket s=new Socket("127.0.0.1",5000);
        File fr=new File("test.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()){
        String se=sc.nextLine();
        DataOutputStream srt=new DataOutputStream(s.getOutputStream());
        srt.writeUTF(se);
        System.out.println(se);
        }
        s.close();
    }
}
