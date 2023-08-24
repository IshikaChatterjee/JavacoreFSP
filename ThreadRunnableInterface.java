class Thread1 implements Runnable{  // STEP 1
    public void run()        // STEP 4
    {
        for(int i = 0; i<10; i++)
        {
             System.out.println("Thread's i = "+i);
        }
    }
     
}

 class ThreadRunnableInterface
 {
    public static void main(String args[])
    {
        Thread1 ob = new Thread1();
        Thread t = new Thread(ob);  // STEP 2
        t.start();  // STEP 3
        for(int i = 0; i<10; i++){
          System.out.println("Thread Main's i = "+i);
        }
    }
 }
    

