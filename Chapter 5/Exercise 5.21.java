/* Chapter 5 Exercise 5.21 (Financial application: compare loans with various interest rates)

*	Write a program that lets the user enter the loan amount and loan period in number of years 
*	and displays the monthly and total payments for each interest rate starting from 5% to 10%, 
*	with an increment of 1/4.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class LoanComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the loan amount in US dollars: $");
        double loanAmount = input.nextDouble();
        
        System.out.print("Enter the loan period in years: ");
        int numYears = input.nextInt();
        
        final int MONTHS = 12;  //Number of months in a year
        
        //Starting annual interest rate in percent form
        double annualInterestRate = 5.0;
        
        System.out.printf("%-20s%-25s%-25s\n", "Interest Rate", "Monthly USD Payment", "Total USD Payment");
        
        for ( ; annualInterestRate <= 10.0; annualInterestRate +=0.25) {
            //Get monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            //Calculate monthly loan payment and total loan amount
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numYears * MONTHS));
            double totalPayment = monthlyPayment * numYears * MONTHS;

            //Variable to change padding size
            int padding = 0;
            
            if (annualInterestRate >= 10.0) {   //Checking width of Interest Rate column
               padding = -1;                    //Reduce the padding on the next column in table by one
            } 
            System.out.printf("%-1.3f%%%" + (padding + 25) + ".2f%25.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}