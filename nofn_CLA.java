//write a program to find out the sum of n number of numbers pass through command line
class nofn_CLA{
    public static void main(String args[]){
   
        int sum = 0;
        for(int i =0; i<args.length; i++)
        {
            int x = Integer.parseInt(args[i]);
            sum = x+sum;
    
        }
        System.out.println("The sum is :" +sum);
    }
    
}
