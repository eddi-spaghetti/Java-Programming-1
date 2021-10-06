/* Chapter 2 Exercise 2.5 (Financial Application: Calculate Tips)

*	Write a program that reads the subtotal and the gratuity rate, then computes the gratuity 
*	and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate, the 
*	program displays $1.5 as gratuity and 11.5 as total.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class CalculateTips {
    public static void main(String[] args) {
        //Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        //Declare variables for total and gratuity total
        double total,
               gratuityTotal;
        
        //Prompt user to enter a subtotal & gratuity rate
        System.out.println("Enter the subtotal in dollars in followed by a space then gratuity rate in decimal form.");
        double subtotal = input.nextDouble(),
               gratuityRate = input.nextDouble();
        
        //Calculate the total amount of gratuity and the total
        gratuityTotal = subtotal * gratuityRate;
        total = gratuityTotal + subtotal;
        
        //Display results
        System.out.println("The gratuity is $" + gratuityTotal + " and total is $" + total);
    }
}