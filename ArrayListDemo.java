import java.util.*;
public class ArrayListDemo {
    
    public static void main(String[] args) {
        
    Arraylist al =  new Arraylist();
    System.out.println("Initial size of a1" + al.size());

    al.add("C");
      al.add("A");
        al.add("E");
          al.add("B");
            al.add("D");
              al.add("V");
                al.add("5");
                  al.add("Ayaan");
                    al.add("20.25");
                      al.add("1.A2");

                      System.out.println("Size of a1 after additions:" +al.size());
                      System.out.println("Contents of a1 :" +al);

                      al.remove("F");
                      al.remove(2);
                      System.out.println("Size of a1 after deletion:" +al.size());
                      System.out.println("Contents of a1 :" +al);


                      Iterator itr = al.iterator();
                      while(itr.hasNext())
                      {
                            System.out.println(itr.next());
                      }


                      String s;
                      Iterator itr2 = al.iterator();
                       while(itr2.hasNext())
                       {
                        s = itr2.next().toString();
                        System.out.println(s);
                       }


                      String s2;
                    for(int i = 0; i < al.size(); i++)
                     {
                         s2 = al.get(i).toString();
                        System.out.println(s2);
                     }
    

       }
}
