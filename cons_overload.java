 class CONS {
    int a,b;
     CONS()
     {
        a = 20;
        b = 30;
     }
    CONS(int x,int y){
        a = x;
        b = y;

    }
     CONS(int x)
     {
        a = x;
        b = 150;
     }
     void display()
     {
        System.out.println("The value of and b are:"+a+" " +b);
     }
}


class cons_overload{
    public static void main(String args[])
    {
        CONS ob1 = new CONS(50);
        CONS ob2 = new CONS(50,60);
        CONS ob3 = new CONS();
        ob1.display();
         ob2.display();
         ob3.display();


    }
}
