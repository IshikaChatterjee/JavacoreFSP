 class A{
    int a = 10;
    
}

class B extends A {
    int a = 20;
    void disp()
    {
        System.out.println(a);    //20
        System.out.println(super.a);  //10

    }
}

class C_super {
    public static void main(String args[])
    {
        B ob = new B();
        ob.disp();   //20,10
    }

}