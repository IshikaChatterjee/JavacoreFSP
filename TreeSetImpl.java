import java.util.*;

public class TreeSetImpl {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("TREE");
        ts.add("DATA");
        ts.add("STRUCTURES");
        ts.add("IMPLEMENT");
        ts.add("SYSTEM");

         System.out.println(ts);

         
        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
      
    
}
    
}
