import java.util.*;
public class Dequeimplement {
    public static void main(String[] args) {
        
        Deque d = new ArrayDeque();
        d.add("FRONT");
         d.add("END");
          d.add("developer");
           d.add("Web Dev");
            d.add("Full Stack");

        System.out.println(d);

        d.offerFirst("Back End");
        d.offerLast("THE END!");

        System.out.println(d);

        d.pollFirst();
        d.pollLast();

        System.out.println(d);


    
}

}
