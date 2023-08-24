public class finally_trycatch {
    public static void main(String args[])
    {
        int x = 12;
        int y = 6;  // if y = 0 , it will give arithmetic exception error but finally statement will run
        try{
             int z = x/y;
              System.out.println("The result is " +z); 
        }
        catch (ArithmeticException e)  /*  there are about 400 exceptionclasses under exception parentclass 
                                       we just write exception */
        {
            System.out.println(e);
        }

        finally {
            System.out.println("THANK YOU !!");
        }
    
}

}


/*public class finally_trycatch {
    public static void main(String args[])
    {
        int x = 12;
        int y = 0;  // if y = 0 , it will give arithmetic exception error but finally statement will run
        try{
             int z = x/y;
              System.out.println("The result is " +z); 
        }
        catch (ArithmeticException e)  /*  there are about 400 exceptionclasses under exception parentclass 
                                       we just write exception 
        {
            System.out.println("Division by 0 results infinity");
        }

        finally {
            System.out.println("THANK YOU !!");
        }
    
}

} */