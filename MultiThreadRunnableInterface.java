// write a prog to create four different threads implementing main method through multiple interface.
 

class Thread1 implements Runnable{  // STEP 1
    public void run()        // STEP 4
    {
        for(int i = 0; i<10; i++)
        {
             System.out.println("Threads 1's i = "+i);
        }
    }
     
}
class Thread2 implements Runnable{  // STEP 1
    public void run()        // STEP 4
    {
        for(int i = 0; i<10; i++)
        {
             System.out.println("Threads 2's i = "+i);
        }
    }
     
}
class Thread3 implements Runnable{  // STEP 1
    public void run()               // STEP 4
    {
        for(int i = 0; i<10; i++)
        {
             System.out.println("Threads 3's i = "+i);
        }
    }
     
}

 class MultiThreadRunnableInterface
 {
    public static void main(String args[])
    {
        Thread1 ob1 = new Thread1();
        Thread2 ob2 = new Thread2();
        Thread3 ob3 = new Thread3();

        Thread t1 = new Thread(ob1);  // STEP 2
        Thread t2 = new Thread(ob2);  // STEP 2
        Thread t3 = new Thread(ob3);  // STEP 2
        t1.start();  // STEP 3
        t2.start(); // STEP 3
        t3.start(); // STEP 3
        for(int i = 0; i<10; i++){
          System.out.println("Thread Main's i = "+i);
        }
    }
 }
    

