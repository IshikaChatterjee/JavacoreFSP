abstract class parent {
   abstract void display();
   void display2()
   {
     System.out.println("Testing for abstract class");
   } 
}

class child extends parent{
    void display()
    {
        System.out.println("This body is provided by child class"); 
    }
    void display3()
    {
        System.out.println("child");
    }
}

public class Abstractclass{
    public static void main(String args[]){
        child obj = new child();
        obj.display();
        obj.display2();
        obj.display3();

    }
}