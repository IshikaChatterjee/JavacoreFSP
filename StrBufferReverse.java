// Wap to accept a string from user and display it in reverse method.
import java.io.*;
public class StrBufferReverse {
    public static void main(String[] args) throws IOException{
        BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Input the String:");

        String str = ds.readLine();
        StringBuffer str1 = new StringBuffer(str);
          System.out.println(str1.reverse());
        
    
}
}
