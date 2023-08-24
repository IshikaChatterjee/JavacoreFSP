class Parent2{
    void display()
       {
         System.out.println("This is the parent class method");
       }
   }
    class Child1 extends Parent2{
        void display()
        {
           System.out.println("This is the Child1 class");
        }
    }
    class Child2 extends Parent2{
        void display()
        {
           System.out.println("This is the Child2 class");
        }
    } 

    class DMD 
    {
         public static void main(String args[])
         {
           Parent2 p = new Parent2();
           p.display();
           Child1 ob1 = new Child1 ();
           Child2 ob2 = new Child2 ();
           ob1.display();
           ob2.display();
           p = ob1;     // the object Child1 has been reffered by the parent's reference variable p
           p.display();
           p = ob2;     //the object Child2 has been referred to the parent's reference variable p
           p.display();
                
        }
    }