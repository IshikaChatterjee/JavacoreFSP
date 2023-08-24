 class this_ex {
    int a,b; // inatance variables
    this_ex(int a,int b)
    {
        this.a = a;
        this.b = b;

    }
    void disp()
    {
        System.out.println(a+" " +b);

        
    }
}
class thiskeyword{
    public static void main(String args[]){
        this_ex ob = new this_ex(20,40); 
        ob.disp();
        
    }
}
