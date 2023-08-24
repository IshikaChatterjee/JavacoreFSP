class A1 extends Thread{
    A1()
    {
        start();

    }
    public void run()
    {
        for(int i=0; i<10; i++){
            System.out.println("A1's i =" +i);

        }
    }
}

class threadExtendclass{
    public static void main (String args[]) 
    {
        new A1();
        for(int i=0; i<=20; i++){
            System.out.println("Main i =" +i);

        }

    }
}
