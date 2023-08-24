//  Write a program to accept two numbers and display the sum and their average


class sumavg_command_L_A{
    public static void main(String args[])
    {
        System.out.println(args[0]);
        System.out.println(args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        int avg = (sum/2);

        System.out.println("The sum of two numbers is" +sum);
        System.out.println("The average of their sum is" +avg);


    }
}