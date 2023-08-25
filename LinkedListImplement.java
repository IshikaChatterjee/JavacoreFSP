import java.util.*;

public class LinkedListImplement {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        li.add("Ayaan");
        li.add("Roy");
        li.add("S");
        li.add("25");

        System.out.println("Size of li after additions=" +li.size());

      Iterator itr = li.iterator();
      while(itr.hasNext()) 
      {
        System.out.println(itr.next());    
      }
      
      li.remove("Roy");
      li.remove(2);

      Iterator itr2 = li.iterator();
      while (itr2.hasNext()){
           System.out.println(itr2.next());

    }

      String s2;
      for(int i = 0; i < li.size(); i++)
      {
        s2 = li.get(i).toString();
        System.out.println(s2);
      }
    
    }
}
