
import java.util.*;
public class stackImplement {
    public static void main(String[] args) {
        Stack st = new Stack();
         st.push("Google");
          st.push("JAVA");
           st.push("web Fundamentals");
            st.push("Frontend Developer");
             st.push("Backend Dev");
              st.push("Full Stack DEveloper");
              System.out.println("Before poping any values:");

              Iterator itr = st.iterator();

              while(itr.hasNext())
              {
                System.out.println(itr.next());
              }

              // POP ELEMETS FROM THE STACK

              st.pop();
              System.out.println("After Popping :");
              Iterator itr2 = st.iterator();
               while(itr2.hasNext())
              {
                System.out.println(itr2.next());
              }


              // TO REMOVE ELEMENTS FROM THE STACK

              st.remove(2);
              System.out.println(" After removing : ");
              Iterator itr3 = st.iterator();
              while(itr3.hasNext())
              {
                System.out.println(itr3.next());
              }

                // TO DISPLAY THE TOP ELEMENTS OF THE STACK

              String st1 = st.peek().toString();
              System.out.println(st1);

              // TO CHECK WHETHER THE STACK IS EMPTY OR NOT

              boolean b = st.empty();
              System.out.println(b);

              //to search element in stack

              int pos = st.search("JAVA");
              System.out.println("The position of JAVA in this list."+pos);

              // TO REMOVE ALL ELEMENTS FROM STACK

              st.removeAllElements();

        }
    
}


// In case of search operation if the element is not present in he stack, then it returns -1