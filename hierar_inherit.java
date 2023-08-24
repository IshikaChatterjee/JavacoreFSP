
 class AA {
    int x = 50;
    int y = 20;
    
}
class B extends AA {
    int a = x+y;
     void display()
    {
        System.out.println("The value of a = " +(x+y));

}
}

class C extends AA {
     int b = x*y;

    void display2()
    {
       
         System.out.println("The value of b = " +(x*y));

    }
}

class hierar_inherit{
    public static void main(String args[])
    {
        B ob = new B();
        C ob1 = new C();
        ob.display();
        ob1.display2();
    }
}
