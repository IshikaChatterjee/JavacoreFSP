import java.io.*;
public class StrBufferReadLineDelete2  {
    public static void main(String[] args) throws IOException{
        BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Input the String:");

        String str = ds.readLine();
        StringBuffer str1 = new StringBuffer(str);
        System.out.println("Enter the starting position and the ending position:");
        int b = Integer.parseInt(ds.readLine());
        int c = Integer.parseInt(ds.readLine());

        str1.delete(b-1, c);
        System.out.println(str1);
        
    }

    
}
