/*public class stringdemo {
    public static void main(String args[]){
        String str = "HELLO CHANDRAYAAN 3 !!";

        int len = str.length();
               System.out.println("Length of the string is "+len);
    }
}*/

/*class stringdemo{
    public static void main (String[]args){
        String s = "STRINGS ARE IMMUTABLE";
        char result = s.charAt(8);
        System.out.print("\n"+result+"\t");
   }
}

/*class stringdemo{
    public static void main (String[]args){
        String str1 = "STRINGS ARE IMMUTABLE";
        String str2 = new String("STRINGS ARE IMMUTABLE");
          String str3 = new String("INTEGERS ARE NOT IMMUTABLE");

          int result = str1.compareTo(str2);
        char result = s.charAt(8);
        System.out.print("\n"+result+"\t");
}
}*/

/*class stringdemo{
    public static void main (String[]args){
        String str = new String("This is really not immutable");
        boolean retVal;

        retVal = str.endsWith("immutable");
        System.out.println("Returned Value :" +retVal); 

        retVal = str.endsWith("immu");
        System.out.println("Returned Value :" +retVal);
   }
}*/


/*class stringdemo{
    public static void main (String[]args){
        String str = new String("This is really not immutable");
        boolean retVal;

        retVal = str.startsWith("This is");
        System.out.println("Returned Value :" +retVal); 

        retVal = str.startsWith("This");
        System.out.println("Returned Value :" +retVal);
   }
}*/

class stringdemo{
    public static void main (String[]args){
        String str = new String("This is");
        boolean retVal;

        retVal = str.equals("This is");
        System.out.println("Returned Value :" +retVal); 

        retVal = str.equals("This");
        System.out.println("Returned Value :" +retVal);
   }

}
