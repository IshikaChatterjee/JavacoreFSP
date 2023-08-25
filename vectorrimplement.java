import java.util.*;

public class vectorrimplement {
    public static void main(String[] args) {
        
        Vector v = new Vector();
         v.add("AAYUSH");
         v.add("Anshuman");
         v.add("Ashish");
         v.add("Karan");
         v.add("Ishika");
         v.add("Kaifi");

         Iterator itr = v.iterator();
         while(itr.hasNext()){

            System.out.println(itr.next());
         }


    }
}
