public class try_catch {
    public static void main(String args[])
    {
        int x = 12;
        int y = 2;  // if y = 0 , it will give arithmetic exception error
        try{
             int z = x/y;
              System.out.println("The result is " +z); 
        }
        catch (ArithmeticException e)  /*  there are about 400 exceptionclasses under exception parentclass 
                                       we just write exception */
        {
            System.out.println(e);
        }

        
}

}



/*public class try_catch {
    public static void main(String args[])
    {
        int x = 12;
        int y = 0;  // if y = 0 , it will give arithmetic exception error
        try{
             int z = x/y;
              System.out.println("The result is " +z); 
        }
        catch (ArithmeticException e)   there are about 400 exceptionclasses under exception parentclass 
                                       we just write exception 
        {
            System.out.println("Division by 0 results infinity");
        }
    
}

}
*/