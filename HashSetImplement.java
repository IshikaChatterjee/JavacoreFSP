import java.util.*;
public class HashSetImplement
{
    public static void main(String[] args) {
        
        HashSet hs = new HashSet();
          hs.add("Hash");
          hs.add("Mapping");
          hs.add("set");
          hs.add("Reset");
          hs.add("Set Interface");

          System.out.println(hs);
           
          hs.remove("set");
          
        // TRAVERSING THE ELEMENTS

          Iterator itr = hs.iterator();
          while(itr.hasNext())
          {
            System.out.println(itr.next());
          }

    }
}