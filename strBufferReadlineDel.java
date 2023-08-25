/*  write a program to accept a string from the user and delete the string 
where the starting and the ending index are also taken from he user */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class strBufferReadlineDel {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a string: ");
            String inputString = reader.readLine();

            System.out.print("Enter the starting index: ");
            int startIndex = Integer.parseInt(reader.readLine());

            System.out.print("Enter the ending index: ");
            int endIndex = Integer.parseInt(reader.readLine());

            if (startIndex < 0 || endIndex >= inputString.length() || startIndex > endIndex) {
                System.out.println("Invalid indices!");
            } else {
                String modifiedString = inputString.substring(0, startIndex) + inputString.substring(endIndex + 1);
                System.out.println("Modified string: " + modifiedString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
