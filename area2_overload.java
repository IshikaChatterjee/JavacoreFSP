//  Write a program in java to calculate the area  of square and rectangle using method overloading 

class area_overload {
    
    void area(int l)
    {
        System.out.println("Area of square is:" +(l*l));

    }
    void area(int l,int b){
        System.out.println("Area of rectangle is:" +(l*b));

    }
    
}

class area2_overload{
    public static void main(String args[])
    {
        area_overload ob = new area_overload();
        ob.area(50,60);
        ob.area(50);
        
    }
}
