public class threads {
    public static void main(String args[]) // denotes from which method the main thread has been called

    {
        Thread ob = new Thread();
        ob.currentThread();
        System.out.println(ob);

         ob.setName("Amaal");
        ob.setPriority(10);

    }
}

   /* error:
   thread 0 is technically the name of the main thread, 5 denotes the default
    priority level of the main thread.
 

   thread class contains a name called setName - using which we can change the name of the thread 
  thread class contains a method called setPriority - using which we can change the priority level of
   a thread. */