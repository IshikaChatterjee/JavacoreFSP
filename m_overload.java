 class func_overload {
    void disp()
    {
        System.out.println("No Argument");

    }
    void disp(int x)
    {
        System.out.println(x);

    }
    void disp(int x,int y){
        System.out.println(x+" "+y);

    }
    
}

class m_overload{
    public static void main(String args[])
    {
        func_overload ob = new func_overload();
        ob.disp(50,60);
        ob.disp(50);
        ob.disp();
    }
}