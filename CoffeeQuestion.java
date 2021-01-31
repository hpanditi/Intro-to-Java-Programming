import java.util.Scanner;
/**
 * Write a description of class CoffeeQuestion here. The purpose of this
 * program is to ask the user whether or not he/she would like a cup of coffee.
 *
 * @author Hemanth Panditi 
 * @version 1.0 Date: January 31, 2021
 */
public class CoffeeQuestion
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Welcome to Deets Cafe");
        System.out.println ("Would you like a cup of coffee?");
        String answer = input.nextLine();
        
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println ("Awesome! What can I get for you.");
        }
        else {
        System.out.println("No problem. Hope you come again!");
    }
    }   
}
