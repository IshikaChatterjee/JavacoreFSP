// program where all the five keywords have been used

class nomatch extends Exception{  //in place of nomatch we can give any name but it should extends exception class

}

class Throweg{
    void check(String s1) throws nomatch{ // there may be some error
        char ch;
        ch = s1.charAt(0);   // POINTING TO INDEX 0- extracting the 1st character from 0 index
        if(ch == 'A')
        {
            System.out.println("Valid Id");
        }
        else{
            throw new nomatch(); // error thst needs to be handled
        }
    }
}

class userdefinedexception
{
    public static void main(String args[])
    {
        Throweg ob  = new Throweg();
        try{
             ob.check("Anshuman");
        }
        catch(nomatch e)
        {
            System.out.println("Invalid Id");
        }
        finally{
            System.out.println("Thank you !");
        }
    }
}