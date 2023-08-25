import java.util.*;

public class LinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("Jamshedpur");
        set.add("Bangalore");
        set.add("Paris");
        set.add("New York");
        set.add("Germany");

          System.out.println(set);
           
          set.remove("set");
          
        // TRAVERSING THE ELEMENTS

          Iterator itr = set.iterator();
          while(itr.hasNext())
          {
            System.out.println(itr.next());
          }
    }
    
}
