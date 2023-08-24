 class parent {
    int a = 10, b= 30;
    void display(){
        int c = a+b;
        System.out.println("The sum is" +c);
    }
    
}

class child extends parent{
    void display()
    {
        super.display();
        int d = a * b;System.out.println("The product is" +d);

    }
}

public class methodoverriding{
    public static void main(String args[]){
        child ob = new child();
        ob.display();
    }
}