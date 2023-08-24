class X {
    int i = 10;
}
class B extends X
{
    void display()
    {
        System.out.println(i);
    }
}
class single_inherit{
    public static void main(String args[])
    {
        B ob = new B();
        ob.display();
    }
}