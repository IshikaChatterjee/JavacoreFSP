import java.io.*;
class throwskeyword{
    public static void main(String args[]) throws IOException
    {
        DataInputStream ds = new DataInputStream(System.in);
      
        System.out.println("Input 3 numbers:");
        int a = Integer.parseInt(ds.readLine());    // readLine take any values in the form of a string
        float b = Float.parseFloat(ds.readLine());
        double c = Double.parseDouble(ds.readLine());

        System.out.println("Enter a string:");
        String ch = ds.readLine();
        System.out.println("String = " +ch);
        System.out.println(" 3 numbers = " + a +" " + b +" "+ c );


    }
}

   /* while running the code : these two notes appear 
    Note: throwskeyword.java uses or overrides a deprecated API.
    Note: Recompile with -Xlint:deprecation for details.*/