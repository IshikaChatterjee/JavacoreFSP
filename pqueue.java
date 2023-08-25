import java.util.*;

public class pqueue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.add("Karanveer");
        queue.add("Vora");
        queue.add("Akshay");
        queue.add("Patahk");
        queue.add("Ranbir Kapoor");

        System.out.println(queue);

        System.out.println("head : " +queue.peek());

        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());


        }

        System.out.println("After first removal ");
        queue.remove();
        System.out.print(queue);
    
     
    // to remove the head element of the queue

    queue.poll();
    System.out.println("After second removal: ");
    System.out.println(queue);

    

}

}